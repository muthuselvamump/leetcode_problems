/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution141{
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null){
            return false;
        }
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
public class LinkedListCycle {
    
}
