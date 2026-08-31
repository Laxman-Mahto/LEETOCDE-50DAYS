package day18;

public class c98 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(s.isValidBST(root));
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
