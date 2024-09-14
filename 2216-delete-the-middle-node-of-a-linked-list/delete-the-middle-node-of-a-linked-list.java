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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }

        ListNode temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        ListNode prev = get(size/2  , head);
        prev.next = prev.next.next;

        return head;        
    }



    public ListNode get(int len,ListNode head){

        ListNode temp = head;

        for(int i=0; i<len-1; i++){
            temp = temp.next;
        }
        return temp;        
    }


}