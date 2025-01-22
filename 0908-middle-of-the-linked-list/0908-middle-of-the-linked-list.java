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
    public ListNode middleNode(ListNode head) {
       ListNode temp = head;
       int counter=0;
       
       while(temp!=null){
         temp=temp.next;
            counter++;
       } 
       temp=head;
       int half= counter/2+1;
       while(temp!=null){
        half=half-1;
        if(half==0){
            break;
        }
         temp=temp.next;
       }
      
       

       return temp;
    }
}