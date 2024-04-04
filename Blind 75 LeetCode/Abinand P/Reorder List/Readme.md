# Problem Analysis
Given a singly-linked list, we are required to reorder its nodes such that they are rearranged in the following manner:
1. First node → Last node → Second node → Second last node → ...
2. The reordering should be done in-place.

# Approach
To solve this problem, we can follow these steps:
1. Find the middle of the linked list using the slow and fast pointer technique.
2. Split the linked list into two halves at the middle node.
3. Reverse the second half of the linked list.
4. Merge the two halves of the linked list alternatively.

# Method
1. Initialize pointers `fast` and `slow` to traverse the linked list. Also, initialize a pointer `prev` to keep track of the node before the middle node.
2. Use the slow and fast pointer technique to find the middle of the linked list. While traversing, keep updating the `prev` pointer.
3. Split the linked list into two halves at the middle node. Set the `next` pointer of `prev` to `nullptr` to separate the two halves.
4. Reverse the second half of the linked list using the `reverse` function.
5. Merge the two halves of the linked list alternatively using the `merge` function. Start by pointing the `next` pointer of each node in the first half to the corresponding node in the reversed second half.

# Complexity Analysis
- Time Complexity: O(N), where N is the number of nodes in the linked list. We traverse the linked list twice: once to find the middle and once to reverse the second half.
- Space Complexity: O(1). We use only a constant amount of extra space for pointers.
