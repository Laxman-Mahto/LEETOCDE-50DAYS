package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class a207 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] pre = {{1, 0}};
        System.out.println(s.canFinish(2, pre));
    }
    static class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                adj.add(new ArrayList<>());
            }
            int[] inDegree = new int[numCourses];
            for (int[] pre : prerequisites) {
                adj.get(pre[1]).add(pre[0]);
                inDegree[pre[0]]++;
            }
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }
            int count = 0;
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                count++;
                for (int next : adj.get(curr)) {
                    inDegree[next]--;
                    if (inDegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
            return count == numCourses;
        }
    }
}
