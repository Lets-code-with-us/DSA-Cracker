Explanation:-Missing Number

Approach:-Find missing element from an araay range [0,n] and return that missing element

*********Detailed Approach*********

*Initalize "num" variable to store missing number

#Sort array

#Run loop from 1 to n and compare that nums[i] != i
    =>If true then store missing number into num as num=i and break
    =>Else i++

#Return num in which missing value is stored

**********Complexity************

Space:-O(1),No space is used
Time:-O(n log n),O(log n) for sorting and O(n) for finding missing element from an array