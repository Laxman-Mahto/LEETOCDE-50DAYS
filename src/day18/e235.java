package day18;

public class e235 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        root.left = p;
        root.right = q;
        TreeNode res = s.lowestCommonAncestor(root, p, q);
        System.out.println(res.val);
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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return null;
            }
            if (p.val < root.val && q.val < root.val) {
                return lowestCommonAncestor(root.left, p, q);
            }
            if (p.val > root.val && q.val > root.val) {
                return lowestCommonAncestor(root.right, p, q);
            }
            return root;
        }
    }
}
