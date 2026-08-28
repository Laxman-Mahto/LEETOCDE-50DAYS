package DAY15;

public class b100 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        System.out.println(s.isSameTree(p, q));
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
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null || p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
