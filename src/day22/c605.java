package day22;

public class c605 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(s.canPlaceFlowers(flowerbed, 1));
    }
    static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int count = 0;
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0) {
                    boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                    boolean emptyRight = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                    if (emptyLeft && emptyRight) {
                        flowerbed[i] = 1;
                        count++;
                    }
                }
            }
            return count >= n;
        }
    }
}
