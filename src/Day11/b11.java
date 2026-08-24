package Day11;

public class b11 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(s.maxArea(height));
    }
    static class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int max = 0;
            while (left < right) {
                int area = Math.min(height[left], height[right]) * (right - left);
                if (area > max) {
                    max = area;
                }
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }
}
