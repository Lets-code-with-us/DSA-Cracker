# Intuition
To find the median of a stream of integers, we can use two heaps: a max-heap to store the smaller half of the numbers and a min-heap to store the larger half. By maintaining the balance between these two heaps, we can efficiently find the median.

# Approach
1. **Using Two Heaps**:
   - We maintain a max-heap (`maxHeap`) to store the smaller half of the numbers and a min-heap (`minHeap`) to store the larger half.
   - When adding a new number, we push it into the max-heap. Then, we push the top element of the max-heap into the min-heap.
   - If the size of the min-heap becomes greater than the max-heap, we push the top element of the min-heap back into the max-heap to maintain balance.

2. **Finding the Median**:
   - If the size of the max-heap is greater than the min-heap, the median is the top element of the max-heap.
   - Otherwise, the median is the average of the top elements of the max-heap and min-heap.

# Complexity Analysis
- Time Complexity:
  - Adding a number: O(log n), where n is the number of elements in the heaps.
  - Finding the median: O(1).
- Space Complexity: O(n), where n is the number of elements in the heaps.
