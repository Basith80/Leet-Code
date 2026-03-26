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
    public ListNode partition(ListNode head, int x) {
       ListNode fl = new ListNode(-1);
        ListNode sl = new ListNode(-1);
        ListNode ft = fl;
        ListNode st = sl;
        while(head != null){
          if(head.val < x){
            ft.next = head;
            ft= ft.next;
            head = head.next;
            ft.next = null;
          }else{
            st.next = head;
            st = st.next;
            head = head.next;
            st.next = null;
          }
        }
        ft.next = sl.next;
        return fl.next;
    }
}