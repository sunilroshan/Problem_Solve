/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        //using first(fast) and second(slow) pointer not fast-slow pointer like that

        //1st finding the length

        ListNode fast = head;
        ListNode slow = head;

        int length = 0;

    while(fast != null && fast.next != null){
         
         fast = fast.next.next;
         slow = slow.next;

         if(fast == slow){
            length = linkedCycle(slow,fast);
            break;
         }
    }

         if(length == 0){
            return null;
         }

         fast = head;
         slow = head;

         while(length > 0){
            slow = slow.next;
            length--;
         }

         while(fast != slow){

            fast = fast.next;
            slow = slow.next;
         }
         

        
         return fast;
        
    }

    public int linkedCycle(ListNode slow,ListNode fast){

        int size = 0;

        ListNode temp = slow;

        do{

            temp = temp.next;
            size++;

        }while(temp != fast);

        return size;
    }
}