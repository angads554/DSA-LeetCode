/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA==null||headB==null){
            return headA;
        }
        // if(headA.next==null||headB.next==null){
        //     return headA;
        // }
        ListNode aTemp=headA;
        ListNode bTemp=headB;
        while(aTemp!=bTemp){
           aTemp=aTemp.next;
           bTemp=bTemp.next;

            if(aTemp==bTemp){
            return aTemp;
           }

           if(bTemp==null){
            bTemp=headA;
           }
           if(aTemp==null){
            aTemp=headB;
           }

        }
        return aTemp;
    }
}