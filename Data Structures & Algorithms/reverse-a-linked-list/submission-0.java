
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;

        }
        if(head.next==null){
            return head;
        }
        ListNode prev= null;
        ListNode current=head;
        while(current!=null){
            ListNode newNode= current.next;
            current.next= prev;
            prev=current;
            current=newNode;
        }
        head=prev;
        return head;
        
    }
}
