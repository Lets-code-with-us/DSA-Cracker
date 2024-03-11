## ThreeSum in Java (Explanation)

This code finds unique triplets in an integer array `nums` that sum to 0.

**Prerequisites:**

* Basic understanding of Java arrays and loops.

**Explanation:**

**1. Sorting and Avoiding Duplicates:**

* **Sorting:** `Arrays.sort(nums)`: Sorts the array for efficient pair finding.
* **Skipping duplicates:** `if (i > 0 && nums[i] == nums[i - 1]) { continue; }`: Ignores consecutive duplicate elements as the first element in triplets.

**2. Two-Pointer Approach:**

* **Pointers:** `left` (index: `i + 1`) and `right` (index: `nums.length - 1`).
* **Loop:** `while (left < right)`: Iterates until `left` and `right` meet.

**3. Checking Sum and Moving Pointers:**

* **Calculate sum:** `sum = nums[i] + nums[left] + nums[right]`.
* **Triplet found:** `if (sum == 0)`: Adds `[nums[i], nums[left], nums[right]]` to `result` and handles duplicates:
    * **Skip `left` duplicates:** `while (left < right && nums[left] == nums[left + 1]) { left++; }`.
    * **Skip `right` duplicates:** `while (left < right && nums[right] == nums[right - 1]) { right--; }`.
* **Adjust pointers:**
    * `sum < 0`: Increment `left` to consider larger elements.
    * `sum > 0`: Decrement `right` to consider smaller elements.

**4. Returning the Result:**

* **Unique triplets:** Returns the `result` list containing all valid triplets.

**Time/Space Complexity:**

* Time: O(n^2) due to nested loops.
* Space: O(1) for variables; O(n) for `result` list.

**Key Points:**

* Efficiently finds unique triplets using sorting and two pointers.

