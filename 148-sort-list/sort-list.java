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
    public ListNode sortList(ListNode head) {

        //important note when they want to return the Listnode just return head

        if(head == null || head.next == null){

            return head;
        }

        ListNode mid = middle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        
        return merge(left,right);
        
    }

        //merge the list

        private ListNode merge(ListNode list1,ListNode list2){
        
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null){

            if(temp1.val < temp2.val){

                cur.next = temp1;
                temp1 = temp1.next;
                
            }

            else{

                cur.next = temp2;
                temp2 = temp2.next;

            }
            
                cur = cur.next;
        }

        if(temp1 != null){
            cur.next = temp1;
        }
        else{
            cur.next = temp2;            
        }

        return dummy.next;




        }
        //middle of the element
        private ListNode middle(ListNode head){

           ListNode midprev = null;

           while(head != null && head.next != null){
            
               midprev = (midprev == null)?head:midprev.next;
               head = head.next.next;
           }

           ListNode mid = midprev.next;
           midprev.next = null;
           return mid;
            
        }
}