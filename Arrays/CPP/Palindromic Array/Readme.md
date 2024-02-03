# Palindrome Array Check

## Problem Description

Given an array of integers, the task is to check if each element in the array is a palindrome. The solution involves iterating through each element in the array and using a helper method to determine whether the element is a palindrome.

## Approach

### Helper Method: `palindro`

This helper method checks whether a given integer is a palindrome.

- **Parameters:**
  - `x`: An integer to be checked for palindrome.

- **Returns:**
  - A boolean:
    - `true` if the integer is a palindrome.
    - `false` otherwise.

### Main Method: `PalinArray`

This main method checks each element in the array for the palindrome property using the helper method `palindro`. The helper method iteratively reverses the digits of the given number and checks if the reversed number is equal to the original number.

- **Parameters:**
  - `a`: An array of integers.
  - `n`: An integer representing the size of the array.

- **Returns:**
  - An integer:
    - `1` if every element in the array is a palindrome.
    - `0` otherwise.

## Approach Details

### Helper Method (`palindro`):

1. **Initialization:**
   - Initialize variables `temp` and `sum` to store the original and reversed numbers, respectively.

2. **Reversing Digits:**
   - Iterate through the digits of the number by repeatedly taking the remainder (`modtemp`) and updating the reversed number (`sum`).
   - Update `temp` by removing the last digit.

3. **Palindrome Check:**
   - Check if the reversed number (`sum`) is equal to the original number.

### Main Method (`PalinArray`):

1. **Iteration Over Array:**
   - Iterate through each element in the array.

2. **Palindrome Check:**
   - For each element, call the helper method `palindro` to check if it is a palindrome.
   - If any element is not a palindrome, return `0`.

3. **Result:**
   - If all elements are palindromes, return `1`.
