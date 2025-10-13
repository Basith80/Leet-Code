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
        String ans = "";
        int mul = 0;
        ListNode ln = head;
        while(ln != null){
            ans += ln.val;
            ln = ln.next;
        }

        return Integer.parseInt(ans , 2);
    }
}