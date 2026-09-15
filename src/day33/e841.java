package day33;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class e841 {
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
