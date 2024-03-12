## Class: Solution

This class contains a method `findItinerary()` to find the itinerary of a trip using the given list of flight tickets.

### Method: `findItinerary`

Finds the itinerary of a trip using the given list of flight tickets.

#### Parameters

- `tickets`: A vector of vectors representing flight tickets. Each ticket is represented as a pair of strings `[from, to]`, where `from` is the departure airport and `to` is the arrival airport.

#### Returns

A vector of strings representing the itinerary of the trip.

#### Approach

1. **Create Adjacency List:**
   - Create an unordered map `hashm` to store the adjacency list of airports.
   - Iterate through the flight tickets and populate the adjacency list. For each departure airport, store the corresponding arrival airports.
2. **Sort Adjacency List:**
   - Sort the adjacency list of each airport in descending order.
   - Sorting in descending order ensures that the lexical order of arrival airports is maintained while exploring the itinerary.
3. **Depth-First Search (DFS):**
   - Implement a depth-first search (DFS) function `dfs` to explore the itinerary.
   - Start DFS from the departure airport "JFK".
   - While there are adjacent airports available for the current airport, recursively explore the next airport.
   - Once all adjacent airports are visited, add the current airport to the result itinerary.
4. **Reverse Result:**
   - Reverse the result itinerary obtained from DFS to get the correct order of flight tickets.
5. **Return Result:**
   - Return the result itinerary.

#### Time Complexity
- Let N be the number of flight tickets.
- Constructing the adjacency list takes O(N) time.
- Sorting the adjacency list for each airport takes O(N log N) time in total.
- Performing DFS to find the itinerary takes O(N) time.
- Reversing the result itinerary takes O(N) time.
- Therefore, the overall time complexity is O(N log N).

#### Space Complexity
- The space complexity of this method is O(N), where N is the number of flight tickets.
  - Additional space is used to store the adjacency list (`hashm`).
  - Recursive calls in DFS also consume space proportional to the depth of the recursion stack.
