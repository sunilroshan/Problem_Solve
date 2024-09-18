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
    public ListNode deleteDuplicates(ListNode head) {

        //hint is the sorted ll

        if(head == null){
            return head;
        }

        ListNode temp = head;

        while(temp.next != null){

            if(temp.val == temp.next.val){
                temp.next = temp.next.next;

            }
            else{

                temp = temp.next;
                              
            }
        }

        return head; // see the quesiton it is given as the list of head
        
    }
}