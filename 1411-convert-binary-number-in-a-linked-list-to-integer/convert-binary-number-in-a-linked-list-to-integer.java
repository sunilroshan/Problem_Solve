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

        StringBuilder sb = new StringBuilder();

        ListNode temp = head;

        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }

        sb.toString();

        int p = 0;
        int ans = 0;

        for(int i = sb.length() - 1; i >= 0; i--){

            if(sb.charAt(i) == '1'){

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