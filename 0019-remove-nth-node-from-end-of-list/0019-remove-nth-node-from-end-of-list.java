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
        while(temp != null){
            temp = temp.next;
            length++;
        }
        ListNode prev = null;
        ListNode curr = head;
        int travel = length - n;       // mtlb hme pta chl jaye hme konsi node se agla delete krvana h or ham usko uske next next se point krva de
        if(length == n) return head.next;            // in case jitni linked list ki length h vhi node hme delete karna h mtlb hame head delete karne h toh ham simply head.next return krva denge
        while(travel > 0){
            prev = curr;
            curr = curr.next;
            travel--;
        }
        prev.next = curr.next;          // isse vo node jo hame delete krvani thi vo delete hojayegi
        return head;
    }
}