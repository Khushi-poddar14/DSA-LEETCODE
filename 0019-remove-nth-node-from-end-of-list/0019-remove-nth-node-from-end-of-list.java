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
        if(head == null || head.next == null) return null;
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        ListNode prev = null;
        ListNode tem = head;
        if(length == n) return head.next;
        int travel = length - n;
        while(travel-- > 0){
            prev = tem;
            tem = tem.next;
        }
        prev.next = tem.next;
        return head;
    }
}