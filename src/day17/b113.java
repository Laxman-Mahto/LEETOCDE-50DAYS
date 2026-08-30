package day17;

import java.util.ArrayList;
import java.util.List;

public class b113 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        System.out.println(s.pathSum(root, 9));
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
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> currentPath = new ArrayList<>();
            dfs(root, targetSum, currentPath, result);
            return result;
        }

        private void dfs(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
            if (node == null) {
                return;
            }
            currentPath.add(node.val);
            if (node.left == null && node.right == null && targetSum == node.val) {
                result.add(new ArrayList<>(currentPath));
            } else {
                dfs(node.left, targetSum - node.val, currentPath, result);
                dfs(node.right, targetSum - node.val, currentPath, result);
            }
            currentPath.remove(currentPath.size() - 1);
        }
    }
}
