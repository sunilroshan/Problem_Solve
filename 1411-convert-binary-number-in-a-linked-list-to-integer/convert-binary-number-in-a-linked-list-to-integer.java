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
    public int getDecimalValue(ListNode head) {

        String num = "";

        ListNode temp = head;

        while(temp != null){
            num += temp.val;
            temp = temp.next;
        }

        int p = 0;
        int ans = 0;

        for(int i = num.length() - 1; i >= 0; i--){

            if(num.charAt(i) == '1'){

                ans += Math.pow(2,p);
                p++;

            }
            else{
                p++;
            }
        }

        return ans;
        
    }
}