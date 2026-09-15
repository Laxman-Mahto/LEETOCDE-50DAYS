package day33;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class e841 {
    public static void main(String[] args) {
        Solution s = new Solution();
        java.util.List<java.util.List<Integer>> rooms = new java.util.ArrayList<>();
        rooms.add(java.util.Arrays.asList(1));
        rooms.add(java.util.Arrays.asList(2));
        rooms.add(java.util.Arrays.asList(3));
        rooms.add(new java.util.ArrayList<>());
        System.out.println(s.canVisitAllRooms(rooms));
    }
    static class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            boolean[] visited = new boolean[rooms.size()];
            visited[0] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);
            int count = 1;
            while (!queue.isEmpty()) {
                int room = queue.poll();
                for (int key : rooms.get(room)) {
                    if (!visited[key]) {
                        visited[key] = true;
                        count++;
                        queue.offer(key);
                    }
                }
            }
            return count == rooms.size();
        }
    }
}
