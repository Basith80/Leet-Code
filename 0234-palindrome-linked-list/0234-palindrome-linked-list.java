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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        ListNode firstHead = head;
        ListNode secondHead = midNode(head);
        secondHead = reverseList(secondHead);

        while (firstHead != null && secondHead != null) {
            if (firstHead.val != secondHead.val) {
                break;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        if (firstHead == null || secondHead == null) {
            return true;
        }
        return false;
    }

    private ListNode midNode(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode after = head.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = after;
            if (after != null) {
                after = after.next;
            }
        }
        return prev;
    }
}