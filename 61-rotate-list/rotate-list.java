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
    public ListNode rotateRight(ListNode head, int k) {

        if(k <= 0 || head == null || head.next == null){
            return head;
        }


        //good effort



    //     for(int i = 0; i < k; i++){

    //         // ListNode last = null;
    //         ListNode reverse = rev(head);

    //         ListNode p1 = reverse;
    //         ListNode p2 = p1.next;

    //         ListNode r1 = rev(p2);
    //         p1.next = r1;

    //         // ListNode reverse = rev(p1);

    //     }

    //     return head;
        
    // }
    // private ListNode rev(ListNode head){
    //     if(head == null || head.next == null){
    //         return head;
    //     }

    //     ListNode prev = null;
    //     ListNode cur = head;
    //     ListNode next = cur.next;

    //     while(cur != null){

    //         cur.next = prev;
    //         prev = cur;
    //         cur = next;

    //         if(next != null){
    //             next = next.next;
    //         }
    //     }

    //     return prev;

            //find the last node and mark tail.next = head

        
            ListNode temp = head;
            int length = 1;

            while(temp.next != null){
                 
                temp = temp.next;
                length++; 

            }

            temp.next = head;


            int rotation = k % length; // when you divide 2 by 5, 5 cannot go into 2 (since 5 is larger), so the remainder is simply 2.
            int skip = length - rotation;

            ListNode end = head;
            for(int i = 0; i < skip-1; i++){

                  end = end.next;
                         
            }

            head = end.next;
            end.next = null;

            return head;


    }
}