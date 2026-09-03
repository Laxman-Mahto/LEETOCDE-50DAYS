package day21;

import java.util.PriorityQueue;

public class d973 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] points = {{1, 3}, {-2, 2}};
        int[][] res = s.kClosest(points, 1);
        System.out.println(java.util.Arrays.deepToString(res));
    }
    static class Solution {
        public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1])
            );
            for (int[] p : points) {
                maxHeap.offer(p);
                if (maxHeap.size() > k) {
                    maxHeap.poll();
                }
            }
            int[][] result = new int[k][2];
            for (int i = 0; i < k; i++) {
                result[i] = maxHeap.poll();
            }
            return result;
        }
    }
}
