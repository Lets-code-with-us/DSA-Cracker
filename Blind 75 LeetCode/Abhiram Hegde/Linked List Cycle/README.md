# Cycle Detection in a Linked List

## Introduction
The given code aims to detect whether a linked list has a cycle or not.

## Algorithm
1. Initialize two pointers, `slow` and `fast`, both pointing to the head of the linked list.
2. Move `slow` one step at a time and `fast` two steps at a time.
3. If the two pointers meet at any point, it indicates a cycle in the linked list.
4. If `fast` reaches the end of the list (i.e., `fast` or `fast.next` becomes null), it means there is no cycle.

## Code Explanation
- The function `hasCycle(ListNode head)` takes the head of the linked list as input and returns `true` if there is a cycle, and `false` otherwise.
- It first checks if the input `head` is `null` or if there is only one node in the list (i.e., `head.next` is `null`). If so, it returns `false` because a single node cannot form a cycle.
- It then initializes `slow` and `fast` pointers.
- The `while` loop continues until `slow` and `fast` pointers meet or `fast` reaches the end of the list.
- Inside the loop, it checks if `fast` or `fast.next` is `null`, which indicates the end of the list and hence no cycle.
- If not, it moves `slow` one step forward and `fast` two steps forward.
- After exiting the loop, if `slow` and `fast` meet, it returns `true`, indicating the presence of a cycle; otherwise, it returns `false`.

## Time Complexity
- The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list.
