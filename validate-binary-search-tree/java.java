/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(Long.MIN_VALUE, root, Long.MAX_VALUE);
    }

    private boolean isValid(long left, TreeNode node, long right) {
        if (node == null) {
            return true;
        }
        if (node.val <= left || node.val >= right) {
            return false;
        }

        return isValid(left, node.left, node.val) && isValid(node.val, node.right, right);
    }
}