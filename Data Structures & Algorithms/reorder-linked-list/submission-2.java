/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2= slow.next;
        slow.next=null;
        ListNode dummy=new ListNode(-1);
        ListNode h1=head,h2=reverse(head2);
        
        while(h2!=null){
            ListNode t1=h1.next;
            ListNode t2=h2.next;
            h1.next=h2;
            h2.next=t1;
            h1=t1;
            h2=t2;
        }
    }
    private ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
}
