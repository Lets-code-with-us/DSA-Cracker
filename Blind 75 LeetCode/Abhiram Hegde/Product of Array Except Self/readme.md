Explanation:

Initialization: Initialize an array answer of the same length as the input array nums. This array will hold the product of all elements except the element itself.

Forward Pass:

Start with answer[0] = 1 since there are no elements to the left of the first element.
For each subsequent element, answer[i] is calculated by multiplying the element to the left of it (nums[i - 1]) with the product of elements to the left of that element (answer[i - 1]).

Backward Pass:

Initialize a variable x = 1.
Traverse the array backwards:
Multiply answer[i] (which contains the product of elements to the left of nums[i]) with x (which contains the product of elements to the right of nums[i]).
Update x by multiplying it with nums[i].
This step effectively multiplies the product of elements to the left with the product of elements to the right for each element.

Time Complexity:

The algorithm traverses the input array twice, once in the forward pass and once in the backward pass. Therefore, the time complexity is O(n), where n is the number of elements in the input array.

Space Complexity:

The space complexity is O(n) because of the additional space used to store the answer array, which has the same length as the input array nums.
