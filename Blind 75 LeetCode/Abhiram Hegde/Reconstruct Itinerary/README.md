### Java Solution for Finding Itinerary

#### Class: `Solution`
- This class contains the method `findItinerary` which takes a list of lists of strings (`List<List<String>> tickets`) as input and returns a list of strings (`List<String>`) representing the reconstructed itinerary.
- It utilizes a depth-first search (DFS) approach to reconstruct the itinerary.

#### Method: `findItinerary`
1. **Graph Initialization**:
   - Creates a `Map<String, List<String>>` named `graph` to represent the graph where the key is the departure airport and the value is a list of arrival airports.
   - Iterates through the input `tickets` and populates the `graph` accordingly.

2. **Sort Destinations**:
   - Sorts the destinations for each departure airport in descending lexical order.
   - This is achieved by sorting each list of destinations using `Collections.reverseOrder()`.

3. **DFS Traversal**:
   - Defines a helper method `dfs` that performs a depth-first traversal starting from the "JFK" airport.
   - Recursively explores the destinations from each airport, removing them from the graph as they are visited.

4. **Reverse Itinerary**:
   - After the DFS traversal, reverses the `itinerary` list to obtain the correct order of airports visited.

5. **Return Result**:
   - Returns the reconstructed itinerary.

#### Method: `dfs`
- This method performs a depth-first traversal starting from a given airport.
- Parameters:
  - `airport`: The current airport being visited.
  - `graph`: The graph representing the flights.
  - `itinerary`: The list to store the reconstructed itinerary.
- Steps:
  1. Retrieves the list of destinations for the current airport from the `graph`.
  2. While there are destinations remaining, recursively calls `dfs` on each destination.
  3. Adds the current airport to the `itinerary` list after visiting all destinations from it.

### Usage
- Instantiate a `Solution` object and call the `findItinerary` method with the list of tickets as input.
- Example:
  ```java
  Solution solution = new Solution();
  List<String> result = solution.findItinerary(tickets);
