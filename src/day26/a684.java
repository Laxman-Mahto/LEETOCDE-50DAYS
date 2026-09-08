package day26;

public class a684 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        System.out.println(java.util.Arrays.toString(s.findRedundantConnection(edges)));
    }
    static class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            int n = edges.length;
            int[] parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
            for (int[] edge : edges) {
                int rootU = find(parent, edge[0]);
                int rootV = find(parent, edge[1]);
                if (rootU == rootV) {
                    return edge;
                }
                parent[rootU] = rootV;
            }
            return new int[0];
        }

        private int find(int[] parent, int i) {
            if (parent[i] != i) {
                parent[i] = find(parent, parent[i]);
            }
            return parent[i];
        }
    }
}
