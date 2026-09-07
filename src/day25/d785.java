package day25;

import java.util.LinkedList;
import java.util.Queue;

public class d785 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        System.out.println(s.isBipartite(graph));
    }
    static class Solution {
        public boolean isBipartite(int[][] graph) {
            int n = graph.length;
            int[] colors = new int[n];
            for (int i = 0; i < n; i++) {
                if (colors[i] == 0) {
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i);
                    colors[i] = 1;
                    while (!queue.isEmpty()) {
                        int curr = queue.poll();
                        for (int neighbor : graph[curr]) {
                            if (colors[neighbor] == 0) {
                                colors[neighbor] = -colors[curr];
                                queue.offer(neighbor);
                            } else if (colors[neighbor] == colors[curr]) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }
}
