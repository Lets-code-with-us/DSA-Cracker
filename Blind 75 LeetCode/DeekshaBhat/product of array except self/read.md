1. Initialization:
    ```python
    length = len(nums)
    answer = [1] * length
    ```
    Here, we find the length of the input array `nums` and initialize the `answer` list with the same length, filled with 1's. This list will eventually store the product of all elements except the current element.

2. Computing Left Products:
    ```python
    left_product = 1
    for i in range(length):
        answer[i] *= left_product
        left_product *= nums[i]
    ```
    In this part, we iterate through the `nums` array from left to right. For each element `nums[i]`, we multiply `answer[i]` with `left_product`, which represents the product of all elements to the left of `nums[i]`. Then, we update `left_product` by multiplying it with `nums[i]`. This way, `answer[i]` holds the product of all elements to the left of `nums[i]`.

3. Computing Right Products:
    ```python
    right_product = 1
    for i in range(length - 1, -1, -1):
        answer[i] *= right_product
        right_product *= nums[i]
    ```
    Similarly, in this part, we iterate through the `nums` array from right to left. For each element `nums[i]`, we multiply `answer[i]` with `right_product`, which represents the product of all elements to the right of `nums[i]`. Then, we update `right_product` by multiplying it with `nums[i]`. This way, `answer[i]` now holds the product of all elements except `nums[i]`.

4. Returning the Result:
    ```python
    return answer
    ```
    Finally, we return the `answer` list, which contains the product of all elements except themselves.

By computing the left and right products separately, we avoid the need for division and achieve the desired result efficiently in linear time complexity.
