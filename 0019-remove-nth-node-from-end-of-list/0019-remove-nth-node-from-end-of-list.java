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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode s = head;
        ListNode e = head;
        while (n != 0) {
            s = s.next;
            n--;
        }
        if(s== null){
            return head.next;
        }
        while (s != null && s.next != null) {
            s = s.next;
            e = e.next;
        }
        e.next = e.next.next;
        return head;
    }
}