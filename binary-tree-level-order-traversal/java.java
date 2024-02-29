import java.util.LinkedList;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        var result = new LinkedList<List<Integer>>();
        var queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            var level = new LinkedList<Integer>();
            var size = queue.size();
            for (var i = 0; i < size; i++) {
                var node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }
}
