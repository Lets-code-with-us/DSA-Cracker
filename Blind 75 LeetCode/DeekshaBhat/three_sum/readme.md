The provided code is an implementation of the "3Sum" problem in Python. Let's break it down step by step:

1. Sorting the Input List:
   ```python
   nums.sort()
   ```
   The input list `nums` is sorted in non-decreasing order. Sorting is crucial for this algorithm to work efficiently.

2. Initializing Variables:
   ```python
   answer = []
   ```
   An empty list named `answer` is initialized. This list will store the triplets whose sum is zero.

3. Main Loop:
   ```python
   for i in range(len(nums) - 2):
   ```
   This loop iterates over the indices of `nums` up to the second last element. The reason for `len(nums) - 2` is because we need at least three elements to form a triplet, so the last two elements won't be the starting points of triplets.

   4. Handling Edge Case:
   ```python
   if nums[i] > 0:
       break
   if i > 0 and nums[i] == nums[i-1]:
       continue
   ```
   - If the current element `nums[i]` is greater than 0, it means no triplet can be formed because all the elements from there on will also be greater than 0 (due to sorting).
   - If `i > 0` (i.e., it's not the first element) and the current element is the same as the previous one, it means we've already processed this number and its duplicates, so we skip it.

5. Initializing Pointers:
   ```python
   l = i + 1
   r = len(nums) - 1
   ```
   Pointers `l` and `r` are initialized. `l` points to the element next to `nums[i]`, and `r` points to the last element of the array.

6. Two Pointer Technique:
   ```python
   while l < r:
       total = nums[i] + nums[l] + nums[r]
       if total < 0:
           l += 1
       elif total > 0:
           r -= 1
       else:
           triplet = [nums[i], nums[l], nums[r]]
           answer.append(triplet)
           while l < r and nums[l] == triplet[1]:
               l += 1
           while l < r and nums[r] == triplet[2]:
               r -= 1
   ```
   - Inside this loop, two pointers technique is employed. `l` starts from `i + 1` and moves forward, `r` starts from the end of the array and moves backward.
   - At each iteration, the sum of `nums[i]`, `nums[l]`, and `nums[r]` is calculated (`total`).
   - If `total` is less than 0, it means we need a larger sum, so `l` is incremented.
   - If `total` is greater than 0, it means we need a smaller sum, so `r` is decremented.
   - If `total` is equal to 0, it means we've found a triplet that sums to zero. This triplet is appended to the `answer` list.
   - Additionally, the inner while loops skip duplicates of `nums[l]` and `nums[r]`.

7. Return:
   ```python
   return answer
   ```
   Finally, the `answer` list containing all the unique triplets whose sum is zero is returned.

This algorithm has a time complexity of O(n^2) due to the nested loop, where n is the number of elements in the input list.
