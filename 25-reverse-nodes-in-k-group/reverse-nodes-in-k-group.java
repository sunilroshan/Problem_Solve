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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k <= 1 || head == null){
            return head;
        }

            ListNode prev = null;
            ListNode cur = head;

        while(true){

            ListNode last = prev;
            ListNode newEnd = cur;


            ListNode next = cur.next;

            //cur != null: This part ensures that the loop terminates if you reach the end of the list before completing k iterations. This prevents you from attempting to reverse a partial group when fewer than k nodes remain, avoiding a NullPointerException.

             ListNode temp = cur;
            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return head; 
                }
                temp = temp.next;
            }

            for(int i = 0;  i < k; i++){
                cur.next = prev;
                prev = cur;
                cur = next;

                if(next != null){
                    next = next.next;
                }

            }

            if(last != null){
                last.next = prev;
            }
            else{
                head = prev;
            }

            newEnd.next = cur;

            if(cur == null){
                break;
            }

            prev = newEnd;
           


        }
        return head;
        
    }
}