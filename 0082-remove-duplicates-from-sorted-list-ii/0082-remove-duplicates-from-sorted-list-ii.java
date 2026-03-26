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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val != cur.next.val) {
                pre.next = cur;
                pre = cur;
                cur = cur.next;
            } else {
                ListNode temp = cur;
                while ( temp != null &&  temp.val == cur.val) {
                    temp = temp.next;
                }
                cur = temp;
            }
        }
        pre.next = cur;
        return dummy.next;
    }
}