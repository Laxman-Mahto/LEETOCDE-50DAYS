package DAY16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class b103 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        System.out.println(s.zigzagLevelOrder(root));
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            boolean leftToRight = true;
            while (!queue.isEmpty()) {
                int size = queue.size();
                LinkedList<Integer> level = new LinkedList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (leftToRight) {
                        level.add(node.val);
                    } else {
                        level.addFirst(node.val);
                    }
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                result.add(level);
                leftToRight = !leftToRight;
            }
            return result;
        }
    }
}
