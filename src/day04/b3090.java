package day04;

public class b3090 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "bcbbbcba";

        System.out.println(s.maximumLengthSubstring(str));
    }

    static class Solution {
        public int maximumLengthSubstring(String s) {

            int[] freq = new int[26];

            int left = 0;
            int answer = 0;

            for (int right = 0; right < s.length(); right++) {

                char c = s.charAt(right);
                freq[c - 'a']++;

                while (freq[c - 'a'] > 2) {
                    freq[s.charAt(left) - 'a']--;
                    left++;
                }

                answer = Math.max(answer, right - left + 1);
            }

            return answer;
        }
    }
}
