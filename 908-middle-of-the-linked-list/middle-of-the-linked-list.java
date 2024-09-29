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

        //it is ok if the interviewer want to ask in only single pass

        // ListNode temp = head;

        // int size = 0;

        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }

        // temp = head;

        // for(int i=0; i<size/2; i++){

        //     temp = temp.next;

        // }

        // ListNode ans = temp;

        // return ans;


        //using fast and slow pointer

        ListNode f = head;
        ListNode s = head;

        while(f != null && f.next != null){

            f = f.next.next;
            s = s.next;
        }
        return s;
        
    }
}