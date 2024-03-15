## Code Explanation: `productExceptSelf` Function

**Problem:**

- Calculate the product of all elements in an array except the element itself.
- Use only constant extra space (no additional arrays).

**Algorithm:**

1. **Initialization:**

   - Store the length of `nums` in `N` for clarity.
   - Create `output_arr` of size `N` to store results.
   - Initialize `output_arr[0]` to 1 (excluding the first element).

2. **Left-to-Right Product Calculation:**

   - Iterate from `i = 1` to `N - 1`:
     - `output_arr[i] = nums[i - 1] * output_arr[i - 1]`
       (product of elements to the left, excluding `nums[i]`)

3. **Right-to-Left Product Calculation:**

   - Initialize `R` to 1 (product of elements seen from the right).
   - Iterate from `i = N - 1` to `0` (backward):
     - `output_arr[i] = output_arr[i] * R`
       (incorporate product of elements from the right)
     - `R = R * nums[i]`
       (update `R` for the next iteration)

4. **Return Result:**

   - Return `output_arr` containing the desired products.

**Key Points:**

- **Efficiency:** Calculates products without extra arrays.
- **Two Loops:** Leverages previous calculations effectively.
- **Time Complexity:** O(n) due to the two linear loops.
- **Space Complexity:** O(1) as it uses only constant additional space.
