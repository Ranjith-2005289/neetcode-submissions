

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // create one dummy node
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        // create two pointers 
        ListNode firstptr= dummy;
        ListNode secondptr= dummy;
        // second ponterptr n spaces ahead
        for(int i=0; i<n; i++){
            secondptr=secondptr.next;
        }
        // move both now, untill the next of second ptr is null
        while(secondptr.next!=null){
            firstptr= firstptr.next;
            secondptr= secondptr.next;

        }
        //we now habe to remove the node next of firstptr
        firstptr.next= firstptr.next.next;
        return dummy.next;

    }
}
