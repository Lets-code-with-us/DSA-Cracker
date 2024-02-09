# Code Explanation: Maximum Product Subarray - java Solution

## Explanation:


Two cases are covered. One where all the numbers are positive and one where the negative numbers are even.

In such case the max product will be the product of all the elements.

In case of odd number of negative elements, either side of an odd element will have the product.

We have leftProduct for the left side and rightProduct for the right side. They cover all the subarrays form left and the right side.

It covers the first case as well, Because when i = n-1, both of them will have the entire product. In case of 0, make them one so that in the next iteration it can caluclate afresh.
