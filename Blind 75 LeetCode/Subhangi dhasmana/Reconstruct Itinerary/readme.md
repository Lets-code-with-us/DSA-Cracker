# Code Explanation: Reconstruct Itinerary - Python Solution

## Explanation:

- It initializes an empty dictionary hashm using defaultdict(list) which will store the adjacency list representation of airports and their corresponding destinations.
- It iterates through each ticket in the input tickets list and populates the hashm dictionary with the departure airports as keys and lists of corresponding arrival airports as values.
- Then, it sorts each list of arrival airports in reverse order lexicographically.
- Initializes an empty list res which will store the final itinerary.
- Defines a nested function dfs (depth-first search) which takes the current airport as input.
- The dfs function recursively visits each airport in the order specified by the sorted lists in hashm until no more destinations are available for the current airport. It appends each visited airport to the res list.
- It calls the dfs function initially with the starting airport 'JFK'.
Finally, it returns the reversed res list, which represents the valid itinerary.

## Complexity:
- Time Complexity: O(nlogn)
- Space Complexity: O(n)