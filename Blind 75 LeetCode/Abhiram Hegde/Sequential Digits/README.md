# Java Solution Explanation

## Class Definition
- The `Solution` class is defined, which contains a single public method `sequentialDigits`.
- This method takes two integer parameters `low` and `high` and returns a list of integers.

## Method Implementation
- Inside the `sequentialDigits` method:
  - A new `ArrayList` named `ans` is initialized to store the sequential digits that fall within the range specified by `low` and `high`.
  - An array `v` is defined, containing predefined sequential digits ranging from 12 to 123456789.
  - A loop iterates over each element `i` in the array `v`.
    - For each element `i`, if it falls within the range specified by `low` and `high`, it is added to the `ans` list.
  - Finally, the method returns the `ans` list containing sequential digits within the specified range.
