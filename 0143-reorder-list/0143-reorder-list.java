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

    private ListNode mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode mid){
        if(mid == null) return mid;
        ListNode prev = null;
        ListNode pres = mid;
        ListNode after = pres.next;

        while(pres != null ){
            pres.next = prev;
            prev = pres;
            pres = after;
            if(after != null ){
                after = after.next;
            }
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;
        ListNode midNode = mid(head);
        ListNode hs = reverse(midNode);
        ListNode hf = head;

        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        } 
     
        if(hf != null){
            hf.next = null;
        }

    }
}