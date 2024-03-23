# Intuition
To find the top k frequent elements in an array, we can use a hash map to count the frequency of each element. Then, we can sort the elements based on their frequencies and select the top k elements.

# Approach
1. **Using a Hash Map**:
   - Initialize an unordered map to store the frequency of each element.
   - Traverse the input array and update the frequency count in the map.
   
2. **Sorting by Frequency**:
   - Convert the hash map to a vector of pairs, where each pair represents an element and its frequency.
   - Sort the vector of pairs based on the frequency of each element in descending order.
   
3. **Selecting Top k Elements**:
   - Traverse the sorted vector and extract the first k elements.
   - Return the top k frequent elements as the result.
   
# Complexity Analysis
- Time Complexity: O(N log N), where N is the number of elements in the input array. Sorting the vector of pairs takes O(N log N) time.
- Space Complexity: O(N), where N is the number of elements in the input array. We use a hash map to store the frequency of each element and a vector to store the pairs.
