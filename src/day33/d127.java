package day33;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class d127 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.ladderLength("hit", "cog", java.util.Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
    }
    static class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> dict = new HashSet<>(wordList);
            if (!dict.contains(endWord)) {
                return 0;
            }
            Queue<String> queue = new LinkedList<>();
            queue.offer(beginWord);
            int level = 1;
            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    String curr = queue.poll();
                    char[] chars = curr.toCharArray();
                    for (int j = 0; j < chars.length; j++) {
                        char original = chars[j];
                        for (char c = 'a'; c <= 'z'; c++) {
                            if (c == original) {
                                continue;
                            }
                            chars[j] = c;
                            String next = new String(chars);
                            if (next.equals(endWord)) {
                                return level + 1;
                            }
                            if (dict.contains(next)) {
                                dict.remove(next);
                                queue.offer(next);
                            }
                        }
                        chars[j] = original;
                    }
                }
                level++;
            }
            return 0;
        }
    }
}
