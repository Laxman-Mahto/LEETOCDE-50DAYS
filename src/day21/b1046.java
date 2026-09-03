package day21;

import java.util.PriorityQueue;

public class b1046 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(s.lastStoneWeight(stones));
    }
    static class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
            for (int stone : stones) {
                maxHeap.offer(stone);
            }
            while (maxHeap.size() > 1) {
                int first = maxHeap.poll();
                int second = maxHeap.poll();
                if (first != second) {
                    maxHeap.offer(first - second);
                }
            }
            return maxHeap.isEmpty() ? 0 : maxHeap.peek();
        }
    }
}
