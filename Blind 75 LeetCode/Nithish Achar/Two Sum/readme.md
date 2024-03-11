### Explanation

The given Java code defines a class named `Solution` with a method `twoSum` that solves the Two Sum problem. The problem statement involves finding two numbers in an array that add up to a given target.

1. **HashMap Initialization:**
    - The method starts by creating a HashMap named `numMap` to store each element of the array along with its index.

    ```java
    Map<Integer, Integer> numMap = new HashMap<>();
    ```

2. **Building the Hash Table:**
    - A loop iterates through the array, populating the HashMap with each element as the key and its corresponding index as the value.

    ```java
    for (int i = 0; i < n; i++) {
        numMap.put(nums[i], i);
    }
    ```

3. **Finding the Complement:**
    - Another loop iterates through the array, calculating the complement for each element with respect to the target.
    - It checks if the complement exists in the HashMap and ensures that the complement's index is not the same as the current element's index.

    ```java
    for (int i = 0; i < n; i++) {
        int complement = target - nums[i];
        if (numMap.containsKey(complement) && numMap.get(complement) != i) {
            return new int[]{i, numMap.get(com
