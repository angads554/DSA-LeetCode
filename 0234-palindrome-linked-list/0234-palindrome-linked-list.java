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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current= head;
        while(current!=null){
            ListNode temp= current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode fro= head;
        ListNode sec= newHead;
        while(sec!=null){
            if(fro.val!=sec.val){
              reverse(newHead);
              return false;
            }
              fro=fro.next;
              sec=sec.next;
        }
        reverse(newHead);
        return true;
    }
}