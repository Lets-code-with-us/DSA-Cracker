/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
 
func reverseList(head *ListNode) *ListNode {
    var nextNode *ListNode
    var prevNode *ListNode 
    prevNode = nil
    for head!=nil{
        nextNode = head.Next
        head.Next = prevNode
        prevNode = head
        head = nextNode
    } 
    return prevNode
}
