// Existing Node class definition (provided)

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Map<Node, Node> visited = new HashMap<>(); // Node mapping for visited nodes
        return dfsClone(node, visited);
    }

    private Node dfsClone(Node node, Map<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node); // Return existing clone
        }

        Node clonedNode = new Node(node.val);
        visited.put(node, clonedNode); // Store the clone in the map

        for (Node neighbor : node.neighbors) {
            clonedNode.neighbors.add(dfsClone(neighbor, visited)); // Clone neighbors recursively
        }

        return clonedNode;
    }
}
