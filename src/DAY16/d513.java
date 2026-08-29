package DAY16;

import java.util.LinkedList;
import java.util.Queue;

public class d513 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(s.findBottomLeftValue(root));
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
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            TreeNode curr = root;
            while (!queue.isEmpty()) {
                curr = queue.poll();
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
            }
            return curr.val;
        }
    }
}
