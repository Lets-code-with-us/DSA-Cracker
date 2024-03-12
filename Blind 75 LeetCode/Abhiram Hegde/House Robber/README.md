1. **Function Definition**: 
    - The `rob` method takes an integer array `nums` as input and returns an integer representing the maximum amount of money that can be robbed without alerting the police.
    
2. **Base Cases**: 
    - If the input array `nums` is null or empty, the function returns 0.
    - If there is only one house, the maximum amount that can be robbed is the money in that house, so the function returns `nums[0]`.
    
3. **Dynamic Programming**:
    - We create an array `dp` of size `n` to store the maximum amount of money robbed until the current house.
    - We initialize the first two elements of `dp` based on the money in the first two houses.
    
4. **Iterative Process**:
    - We iterate through the rest of the houses starting from the third house.
    - At each house `i`, we have two choices:
        - Rob the current house along with the money robbed until two houses ago (`nums[i] + dp[i - 2]`).
        - Skip the current house and take the maximum money robbed until the previous house (`dp[i - 1]`).
    - We choose the maximum of these two choices and store it in `dp[i]`.
    
5. **Return**:
    - Finally, we return `dp[n - 1]`, which represents the maximum amount of money robbed from the last house without alerting the police.
