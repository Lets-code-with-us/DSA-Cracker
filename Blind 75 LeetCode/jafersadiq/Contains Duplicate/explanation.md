# Contains Duplicate

## Introduction

This algorithm determines whether an array of integers contains any duplicates. It employs a HashMap to efficiently track the occurrence of each element in the array.

## Approach

1. **HashMap Usage:**
   - The solution uses a HashMap to store the frequency of each element.

2. **Iterative Check:**
   - The algorithm iterates through the array.
   - For each element:
     - Checks if the element is already present in the HashMap.
     - If found, the array contains a duplicate, and the algorithm returns `true`.
     - If not found, the element is added to the HashMap with a frequency of 1.

3. **Result:**
   - If the iteration completes without finding any duplicates, the algorithm returns `false`.

## Time Complexity

The time complexity is O(n), where n is the length of the input array. In the worst case, the algorithm iterates through the entire array once.

## Space Complexity

The space complexity is O(n) as well, where n is the length of the input array. In the worst case, the HashMap may store all elements of the array.

## Usage

This algorithm provides an efficient way to check whether an array of integers contains any duplicates. It can be used in scenarios where quick duplicate detection is required.
