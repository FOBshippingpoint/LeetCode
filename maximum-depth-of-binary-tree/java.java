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
    public int maxDepth(TreeNode root) {
        return traverse(root, 0);
    }
    
    public int traverse(TreeNode node, int depth) {
        if (node != null) {
            return Math.max(traverse(node.left, depth + 1), traverse(node.right, depth + 1));
        } else {
            return depth;
        }
    }
}
