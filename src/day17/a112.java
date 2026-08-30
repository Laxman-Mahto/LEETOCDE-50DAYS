package day17;

public class a112 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        System.out.println(s.hasPathSum(root, 9));
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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null) {
                return targetSum == root.val;
            }
            return hasPathSum(root.left, targetSum - root.val) ||
                   hasPathSum(root.right, targetSum - root.val);
        }
    }
}
