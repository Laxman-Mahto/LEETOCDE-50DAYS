package DAY15;

public class d110 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(s.isBalanced(root));
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
        public boolean isBalanced(TreeNode root) {
            return checkHeight(root) != -1;
        }

        private int checkHeight(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int leftHeight = checkHeight(node.left);
            if (leftHeight == -1) {
                return -1;
            }
            int rightHeight = checkHeight(node.right);
            if (rightHeight == -1) {
                return -1;
            }
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            }
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
