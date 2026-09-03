package day21;

import java.util.PriorityQueue;

public class c703 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargest kth = new KthLargest(3, nums);
        System.out.println(kth.add(3));
        System.out.println(kth.add(5));
        System.out.println(kth.add(10));
    }
    static class KthLargest {
        private PriorityQueue<Integer> minHeap;
        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            minHeap = new PriorityQueue<>(k);
            for (int num : nums) {
                add(num);
            }
        }

        public int add(int val) {
            minHeap.offer(val);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
            return minHeap.peek();
        }
    }
}
