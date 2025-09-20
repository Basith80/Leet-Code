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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        if(left == right) return head;

        ListNode prev = null;
        ListNode pres = head;

        for(int i=0; i< left-1; i++){
            prev = pres;
            pres = pres.next;
        }

        ListNode newEnd = pres;
        ListNode last = prev;
        ListNode after = pres.next;
        
        for(int i=0 ; i< right - left +1 ; i++){
            pres.next = prev;
            prev = pres;
            pres = after;
            if(after != null){
                after = after.next;
            }
        }
        if(last != null){
        last.next = prev;}
        else{
            head = prev;
        }
        newEnd.next = pres;
        return head;
    }
}