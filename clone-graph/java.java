import java.util.HashMap;
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        return clone(node);
    }

    Node clone(Node node) {
        if (map.containsKey(node)) {
            return map.get(node);
        } else if (node == null) {
            return null;
        }
        var clonedNode = new Node(node.val);
        map.put(node, clonedNode);
        for (var n : node.neighbors) {
            clonedNode.neighbors.add(clone(n));
        }
        return clonedNode;
    }
}
