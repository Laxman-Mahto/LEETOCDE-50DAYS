package day21;

import java.util.PriorityQueue;

public class a215 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(s.findKthLargest(nums, 2));
    }
    static class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            for (int num : nums) {
                minHeap.offer(num);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
            return minHeap.peek();
        }
    }
}
