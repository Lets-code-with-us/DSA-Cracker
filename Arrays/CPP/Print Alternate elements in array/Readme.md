# Print Alternate Elements

## Function: `print`

Prints alternate elements of the given array.

### Parameters

- `ar[]`: An array of integers.
- `n`: The number of elements in the array.

### Approach

The `print` function iterates through the array and prints every alternate element starting from the first element (index 0).

1. **Iteration Through Array:**
   - Initialize a loop variable `i` to 0.
   - Iterate through the array while `i` is less than `n`.
   - In each iteration, increment `i` by 2 to skip every alternate element.

2. **Printing Elements:**
   - Inside the loop, print the element at index `i`.

The function prints every alternate element of the array by iterating through it and incrementing the loop variable by 2 in each iteration.
