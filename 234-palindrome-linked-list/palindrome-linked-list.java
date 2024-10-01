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
    public boolean isPalindrome(ListNode head) {

        ListNode mid = middle(head);//first head
        ListNode reverse = reversemid(mid);//second head
        ListNode rereverse = reverse;

        while(head != null && reverse != null){
            if(head.val != reverse.val){
                break;
            }
            head = head.next;
            reverse = reverse.next;
        }

        reversemid(rereverse);

        if(head == null || reverse == null){
            return true;
        }
        else{
            return false;
        }
        
    }

    private ListNode reversemid(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;

            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    private ListNode middle(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}