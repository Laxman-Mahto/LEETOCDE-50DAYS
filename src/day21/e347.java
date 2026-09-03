package day21;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class e347 {
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
