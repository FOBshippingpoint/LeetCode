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
    public int diameterOfBinaryTree(TreeNode root) {
        return maxLength(root);
    }
    
    int maxDepth(TreeNode node, int depth) {
        if (node != null) {
            return Math.max(maxDepth(node.left, depth + 1), maxDepth(node.right, depth + 1));
        } else {
            return depth;
        }
    }
    
    int maxLength(TreeNode node) {
        if (node != null) {
            int max = maxDepth(node.left, 0) + maxDepth(node.right, 0);
            int childMaxLength = Math.max(maxLength(node.left), maxLength(node.right));
            return Math.max(max, childMaxLength);
        } else {
            return 0;
        }
    }
}
