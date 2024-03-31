class Solution{
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }
    public ListNode reverseListRecursive(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseListRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
