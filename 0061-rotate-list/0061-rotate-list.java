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
    private ListNode findNewLastNode(ListNode head, int l){
        ListNode temp= head;
        int count=1;
        while(temp!=null){
            if(count == l){return temp;} 
            temp=temp.next;
            count++;
        }
        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null){
            return head;
        }

        ListNode last= head;
        int len=1;
        while(last.next!=null){
            last=last.next;
            len++;
        }

        if(k%len==0) return head;
        k=k%len;
        last.next=head;

        ListNode newLastNode=findNewLastNode(head,len-k);
        head=newLastNode.next;
        newLastNode.next= null;

        return head; 
    }
}