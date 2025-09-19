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
     ArrayList<Integer> list = new ArrayList<>();
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
    ListNode pre = null;
    ListNode pres = head;
    ListNode after = pres.next;

    while(pres != null){
        pres.next = pre;
        pre = pres;
        pres = after;
        if(after != null){
            after = after.next;
        }
    }

    return pre;
    }
}


/*
ListNode prev = null;
        ListNode curr = head; 
        while (curr != null) {
            ListNode nextTemp = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = nextTemp;
        }
        return prev; 
*/
