package day21;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class e347 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] res = s.topKFrequent(nums, 2);
        System.out.println(java.util.Arrays.toString(res));
    }
    static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b)
            );
            for (int key : map.keySet()) {
                minHeap.offer(key);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = minHeap.poll();
            }
            return result;
        }
    }
}
