package day35;

public class b124 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(s.maxPathSum(root));
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
        private int maxSum = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            maxSum = Integer.MIN_VALUE;
            maxGain(root);
            return maxSum;
        }

        private int maxGain(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int leftGain = Math.max(maxGain(node.left), 0);
            int rightGain = Math.max(maxGain(node.right), 0);
            int priceNewPath = node.val + leftGain + rightGain;
            maxSum = Math.max(maxSum, priceNewPath);
            return node.val + Math.max(leftGain, rightGain);
        }
    }
}
