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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode pres = head;
        ListNode pos = head.next;
        while(pres != null){
            pres.next = pre;
            pre = pres;
            pres = pos;
            if(pos != null){
                pos = pos.next;
            }
        }
        return pre;
    }
}