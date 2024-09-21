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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;

       // LinkedList ans = new LinkedList();//which are not part of the standard way to handle linked lists in Java.

        //how in i<n likeie) temp != null

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy; // it is like temp and dummy is like a head

        while(temp1 != null && temp2 != null){

            if(temp1.val <= temp2.val){
                cur.next = temp1;
                temp1 = temp1.next;
            }
            else{
                cur.next = temp2;
                temp2 = temp2.next;
            }

          cur = cur.next;

        }

        //if list1 1-2-3
        //   list2 1-2-3-4-5

        while(temp1 != null){
            cur.next = temp1;
            temp1 = temp1.next;
             cur = cur.next;
        }
        while(temp2 != null){
            cur.next = temp2;
            temp2 = temp2.next;
             cur = cur.next;
        }

        return dummy.next; // Return the next of the dummy node, which is the head of the new list
        
    }
}