package day01;

import java.util.Arrays;

public class d1299 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(s.replaceElements(arr)));
    }

    static class Solution {
        public int[] replaceElements(int[] arr) {
            int max = -1;
            for (int i = arr.length - 1; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = max;
                if (temp > max) {
                    max = temp;
                }
            }
            return arr;
        }
    }
}
