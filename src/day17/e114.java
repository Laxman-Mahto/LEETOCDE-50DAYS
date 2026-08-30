package day17;

public class e114 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        private TreeNode prev = null;

        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }
            flatten(root.right);
            flatten(root.left);
            root.right = prev;
            root.left = null;
            prev = root;
        }
    }
}
