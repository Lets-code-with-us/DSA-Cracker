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
    public Node cloneGraph(Node node) {
            if (node == null)//if node is null then
      return null;//we return null
    if (map.containsKey(node))//if map containsKey node is true then
      return map.get(node);//return node value in map

    Node newNode = new Node(node.val);//we create a newNode and initialize the node value to it
    map.put(node, newNode);//we put the node and newNode into map  

    for (Node neighbor : node.neighbors)//we traverse the node 
      newNode.neighbors.add(cloneGraph(neighbor));//we add neighbor into newNode

    return newNode;//we return the newNode
  }

  private Map<Node, Node> map = new HashMap<>();//we make a HashMap map of Node 

        
    }