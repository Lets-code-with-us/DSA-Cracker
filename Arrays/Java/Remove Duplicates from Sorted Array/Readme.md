## Intuition
We can think of using two pointers ‘i’ and ‘j’. We move ‘j’ until we encounter a number `arr[j]` that is different from `arr[i]`. As we find a unique number, we increment the `i` pointer and update its value to be `arr[j]`.

## Approach
1. Take a variable `i` and initialize it to 0.
2. Use a for loop with a variable `j` ranging from 1 to the length of the array.
3. If `arr[j]` is not equal to `arr[i]`, increment `i` and update `arr[i]` to be `arr[j]`.
4. After the completion of the loop, return `i + 1`, which represents the size of the array containing unique elements.

## Complexity
- Time complexity: O(n)
- Space complexity: O(1)
