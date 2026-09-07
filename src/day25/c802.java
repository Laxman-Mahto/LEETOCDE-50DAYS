package day25;

import java.util.ArrayList;
import java.util.List;

public class c802 {
    static class Solution {
        public List<Integer> eventualSafeNodes(int[][] graph) {
            int n = graph.length;
            int[] state = new int[n];
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (dfs(graph, i, state)) {
                    result.add(i);
                }
            }
            return result;
        }

        private boolean dfs(int[][] graph, int node, int[] state) {
            if (state[node] > 0) {
                return state[node] == 2;
            }
            state[node] = 1;
            for (int next : graph[node]) {
                if (state[next] == 2) {
                    continue;
                }
                if (state[next] == 1 || !dfs(graph, next, state)) {
                    return false;
                }
            }
            state[node] = 2;
            return true;
        }
    }
}
