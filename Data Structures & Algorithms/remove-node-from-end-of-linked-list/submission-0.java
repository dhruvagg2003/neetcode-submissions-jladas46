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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode prev=null,temp=head;
        int i=0,size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n == size) return head.next;
        temp=head;
        int n1=size-n;
        while(i<n1){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=temp.next;
        temp.next=null;
        return head;
    }
}
