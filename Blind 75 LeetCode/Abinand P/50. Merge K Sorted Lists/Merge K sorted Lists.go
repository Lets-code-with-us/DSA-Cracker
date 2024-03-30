/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func mergeKLists(lists []*ListNode) *ListNode {
    if len(lists) == 0{
        return nil;
    }
    return mergeKListHelper(lists,0,len(lists)-1)
}
func mergeKListHelper(lists []*ListNode, start int, end int) *ListNode {
    if start == end{
        return lists[start]
    }
    if start+1 == end {
        return merge (lists[start], lists[end])
    }
    mid := start+ (end -start)/2
    left  := mergeKListHelper(lists, start, mid);
    right := mergeKListHelper( lists, mid+1, end);
    return merge(left, right);
}
func merge (l1 *ListNode, l2 *ListNode) *ListNode {
    curr := &ListNode {
        Val : 0,
        Next : nil,
    }
    dummy := curr
    for (l1!=nil && l2!=nil){
        if (l1.Val < l2.Val){
            curr.Next =l1
            l1 = l1.Next
        } else {
            curr.Next = l2
            l2 = l2.Next
        }
        curr = curr.Next
    }
    if l1!=nil {
        curr.Next = l1
    } else {
        curr.Next =l2
    }
    return dummy.Next
}
