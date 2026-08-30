package day17;

import java.util.HashMap;
import java.util.Map;

public class d105 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        private int preorderIndex;
        private Map<Integer, Integer> inorderMap;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            preorderIndex = 0;
            inorderMap = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                inorderMap.put(inorder[i], i);
            }
            return helper(preorder, 0, inorder.length - 1);
        }

        private TreeNode helper(int[] preorder, int inStart, int inEnd) {
            if (inStart > inEnd) {
                return null;
            }
            int rootVal = preorder[preorderIndex++];
            TreeNode root = new TreeNode(rootVal);
            int inIndex = inorderMap.get(rootVal);
            root.left = helper(preorder, inStart, inIndex - 1);
            root.right = helper(preorder, inIndex + 1, inEnd);
            return root;
        }
    }
}
