# Code Explanation: Missing Number - java Solution

Intuition

Gaussian summation formula (n * (n + 1)) / 2

Approach

The missingNumber function takes an array of consecutive numbers as its argument. It first calculates the expected sum of the sequence using the Gaussian summation formula.

It then calculates the sum of the numbers in the array using the reduce method or by for Loop, which adds up all the numbers in the array starting from an initial value of 0.

Finally, it subtracts the sum of array from the total sum to get the missing number, and returns it. Both solutions are same time complexity and solution.
