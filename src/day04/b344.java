package day04;

public class b344 {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        s.reverseString(chars);
        System.out.println(new String(chars));
    }

    static class Solution {
        public void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;
            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
    }
}
