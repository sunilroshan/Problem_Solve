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

        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        temp = head;

        for(int i=0; i<size/2; i++){

            temp = temp.next;

        }

        ListNode ans = temp;

        return ans;
        
    }
}