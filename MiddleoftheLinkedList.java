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
class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
        
    }
     public ListNode Middle(ListNode head)
        if(head==null || head.next==null){
            return head;
        }
            ListNode fast=head;
            ListNode slow=null;

            ListNode ans=null;
            while(fast!=null &&fast.next !=null){
                slow=slow==null?head:slow.next;
                fast=fast.next.next;
            }
            ans=slow.next;
            slow.next=null;
            return ans;
    }
}
public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        
    }
    
}
