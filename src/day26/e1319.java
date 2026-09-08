package day26;

public class e1319 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] connections = {{0, 1}, {0, 2}, {1, 2}};
        System.out.println(s.makeConnected(4, connections));
    }
    static class Solution {
        public int makeConnected(int n, int[][] connections) {
            if (connections.length < n - 1) {
                return -1;
            }
            int[] parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            int components = n;
            for (int[] edge : connections) {
                int rootU = find(parent, edge[0]);
                int rootV = find(parent, edge[1]);
                if (rootU != rootV) {
                    parent[rootU] = rootV;
                    components--;
                }
            }
            return components - 1;
        }

        private int find(int[] parent, int i) {
            if (parent[i] != i) {
                parent[i] = find(parent, parent[i]);
            }
            return parent[i];
        }
    }
}
