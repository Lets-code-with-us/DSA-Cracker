# Solution Explanation - Maximum Subarray (Python3)

## Step 1 : Initialization

* `maxSum` : This variable stores the maximum sum found so far, initialized with the first element of the list (`nums[0]`).
* `currentSum` : This variable tracks the sum of the current subarray being considered, also initialized with the first element.

## Step 2 : Iteration

* The for loop iterates through all elements of the list except the first one (`nums[1:]`)
* For each element:
    * `currentSum` is updated by taking the maximum of two values:
      * The current element itself (`n`)
      * The previous `currentSum` plus the current element (`currentSum + n`)
    * maxSum is updated by taking the maximum of two values:
      * The current `maxSum`
      * The updated `currentSum`

## Step 3 : Output

* After iterating through all elements, the final `maxSum` holds the maximum sum of any contiguous subarray in the list
* The function returns `maxSum`
