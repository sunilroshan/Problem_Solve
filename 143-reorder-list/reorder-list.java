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
    public void reorderList(ListNode head) { //  i think that there is void so we have to print ...here no we are doing inplace

      ListNode mid = middle(head);

      ListNode hs = reversemid(mid);//here i am gettin the prev
      ListNode hf = head;

      while(hf != null && hs != null){

           ListNode temp1 = hf.next; // for temporory storage
           hf.next = hs;
           hf = temp1;

           ListNode temp2 = hs.next;
           hs.next = hf;
           hs = temp2;
      }
       
    if(hf != null){

      hf.next = null;
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