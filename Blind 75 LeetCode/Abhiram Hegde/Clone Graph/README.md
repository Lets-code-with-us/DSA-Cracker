##Explanation

The code consists of two classes:

Solution Class:

-Contains the cloneGraph method that takes a reference to a node (node) and returns the cloned root node of the entire graph.
-Utilizes a HashMap named map to store mappings between original nodes and their corresponding clones. This prevents creating duplicate clones during the cloning process.
-Calls the helper method clone to initiate the recursive cloning process.

Helper Method (clone):

-This recursive method takes two arguments:
-node: The node to be cloned.
-map: The HashMap used to track cloned nodes.

Handles base cases:

-If node is null, returns null.
-If node already exists in the map (meaning it's been cloned), returns the cloned node from the map.
-Creates a new node (newNode) with the same value as the original node and adds it to the map.

Iterates through the neighbors of the original node:

-For each neighbor, recursively calls clone to create its clone and adds the cloned neighbor to the neighbor list of the current cloned node.
-Returns the newly created and fully linked cloned node.

This recursive approach ensures that the entire graph structure is traversed and cloned, resulting in a deep copy of the original graph.
