### Explanation of MedianFinder Class

The `MedianFinder` class is designed to efficiently find the median of a stream of integers.

#### Instance Variables:
- `lowerHalf`: A priority queue (min-heap) that stores the lower half of the numbers.
- `higherHalf`: A priority queue (max-heap) that stores the higher half of the numbers.

#### Constructor:
- Initializes the `lowerHalf` as a max-heap (by using `Collections.reverseOrder()`) and the `higherHalf` as a min-heap.

#### Method: `addNum(int num)`
- Adds a new number to the data stream.
- The number is added to the `lowerHalf` priority queue.
- Then, the top element of `lowerHalf` (the maximum value) is moved to `higherHalf`.
- If the size of `lowerHalf` becomes less than the size of `higherHalf`, the top element of `higherHalf` (the minimum value) is moved back to `lowerHalf`, ensuring that the sizes are balanced.

#### Method: `findMedian()`
- Calculates and returns the median of the data stream.
- If the size of `lowerHalf` is greater than the size of `higherHalf`, the median is simply the top element of `lowerHalf`.
- Otherwise, the median is calculated as the average of the top elements of `lowerHalf` and `higherHalf`.
  - Note: To ensure accuracy, the division is done by `2.0` to get a double result.

This implementation efficiently maintains two priority queues to track the lower and higher halves of the data stream, ensuring that the median can be calculated in constant time.
