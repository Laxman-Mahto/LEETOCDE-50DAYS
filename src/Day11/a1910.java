package Day11;

public class a1910 {
    public static void main(String[] args) {

        Solution s = new Solution();

        String s1 = "daabcbaabcbc";
        String part = "abc";

        System.out.println(s.removeOccurrences(s1, part));
    }

    static class Solution {

        public String removeOccurrences(String s, String part) {

            while (s.contains(part)) {
                s = s.replaceFirst(part, "");
            }

            return s;
        }
    }
}