/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDiff;
    public int maxAncestorDiff(TreeNode root) {
        maxDiff = 0;
        dfs(root, root.val, root.val);
        return maxDiff;
    }

    private void dfs(TreeNode node, int maxSoFar, int minSoFar) {
        if (node == null) {
            return;
        }

        // Update the maximum difference
        maxDiff = Math.max(maxDiff, Math.max(Math.abs(node.val - maxSoFar), Math.abs(node.val - minSoFar)));

        // Update the maximum and minimum values encountered so far
        maxSoFar = Math.max(maxSoFar, node.val);
        minSoFar = Math.min(minSoFar, node.val);

        // Recursively visit left and right children
        dfs(node.left, maxSoFar, minSoFar);
        dfs(node.right, maxSoFar, minSoFar);
    }

}