package day18;

public class c98 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public boolean isValidBST(TreeNode root) {
            return validate(root, null, null);
        }

        private boolean validate(TreeNode node, Integer min, Integer max) {
            if (node == null) {
                return true;
            }
            if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
                return false;
            }
            return validate(node.left, min, node.val) && validate(node.right, node.val, max);
        }
    }
}
