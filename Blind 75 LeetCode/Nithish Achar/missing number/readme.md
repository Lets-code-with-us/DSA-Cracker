## Missing Number in Array (Java)

This document explains two approaches to finding the missing number in an array containing `n` distinct numbers in the range `[0, n]`.

**1. Using Sum (Math-based approach)**

This solution leverages the concept of an arithmetic series sum.

**Explanation:**

* Calculate Expected Sum:
    - `n` represents the length of the `nums` array.
    - The formula `n * (n + 1) / 2` calculates the sum of all numbers from 0 to `n`. This represents the expected sum if all numbers were present in the array.
* Find Actual Sum:
    - A loop iterates through the `nums` array, adding each element to the `actualSum` variable. This captures the sum of the numbers actually present in the array.
* Missing Number:
    - By subtracting the `actualSum` from the `expectedSum`, we get the difference, which is the missing number. The missing number wasn't included in the `actualSum` but should have been present for the complete series.

**Code Example:**

```java
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
