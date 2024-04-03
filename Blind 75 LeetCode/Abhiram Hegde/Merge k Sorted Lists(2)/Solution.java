class Solution{
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null || lists.length==0) return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode head:lists){
            if(head!=null){
                pq.add(head);
            }
        }
        ListNode head=null,tail=null;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            if(head==null){
                head=tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
            if(node.next!=null){
                pq.add(node.next);
            }
        }
        return head;
    }
}
