/
Explanation:
HashMap Initialization:
A HashMap named `mp` is initialized to store the elements and their corresponding indices in the array.
Iterating through Array:
The code uses a for loop to iterate through the vector `nums`.
Checking for Complement in HashMap:
It checks if the complement of the current element `(target - nums[i])` exists in the HashMap.
If found, it returns the indices of the two numbers as a vector.
Storing Complement in HashMap:
If the complement is not found, it puts the current element `nums[i]` and its index `i` into the HashMap.
Complexity:
Time Complexity: O(n) - where n is the length of the vector.
Space Complexity: O(n) - due to the HashMap storing at most n elements.

