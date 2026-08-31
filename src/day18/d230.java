package day18;

import java.util.Stack;

public class d230 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public int kthSmallest(TreeNode root, int k) {
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                k--;
                if (k == 0) {
                    return curr.val;
                }
                curr = curr.right;
            }
            return -1;
        }
    }
}
