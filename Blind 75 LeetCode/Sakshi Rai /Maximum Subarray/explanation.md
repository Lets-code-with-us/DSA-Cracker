This C++ code implements Kadane's algorithm to find the maximum sum of a contiguous subarray within the given vector 'nums' 
It initializes two variables, 'max_sum' set to INT_MIN  and 'curr_sum,'set to 0 ,initially. It iterates through each element of 'nums,' updating
'curr_sum' by choosing the maximum between the current element and the sum of the current element and the previous 'curr_sum.' Simultaneously,
it updates 'max_sum' to store the maximum subarray sum encountered so far. The function returns the final 'max_sum,' representing the maximum
sum of a contiguous subarray in the given vector.





