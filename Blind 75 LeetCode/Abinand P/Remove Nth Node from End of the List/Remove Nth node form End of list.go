/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func removeNthFromEnd(head *ListNode, n int) *ListNode {
    dummy := &ListNode{
        Val: 0,
        Next: head,
    }
    first := dummy
    second := dummy
    // Move first pointer to the nth node from the beginning
    for i := 0; i <= n; i++ {
        if first == nil {
            return head // List length is less than n
        }
        first = first.Next
    }
    // Move both pointers until first pointer reaches the end
    for first != nil {
        first = first.Next
        second = second.Next
    }
    // Remove the nth node from the end
    second.Next = second.Next.Next
    return dummy.Next
}
