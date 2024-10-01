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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null){
            return head;
        }

        if(left == right){
            return head;
        }

        //first we are bringing the cur to the left

        ListNode prev = null;
        ListNode cur = head;

        for(int i = 0; i < left-1; i++){
            prev = cur;
            cur = cur.next;
        }

        ListNode last = prev;
        ListNode newEnd = cur;

        //acually reversing b/w the left and right

        ListNode next = cur.next;

        for(int i = 0; i < right-left+1; i++){
            cur.next = prev;
            prev = cur;
            cur = next;

            if(next != null){
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev; // here prev is 4

        }
        else{
            head = prev; //[3,5],1,2
        }

        newEnd.next = cur;

        return head;
        
    }
}