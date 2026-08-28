package DAY15;

public class e543 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(s.diameterOfBinaryTree(root));
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
        private int maxDiameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            maxDiameter = 0;
            maxDepth(root);
            return maxDiameter;
        }

        private int maxDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);
            maxDiameter = Math.max(maxDiameter, left + right);
            return Math.max(left, right) + 1;
        }
    }
}
