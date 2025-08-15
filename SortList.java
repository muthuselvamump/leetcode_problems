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
class Solution148 {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        return sortList1(head);
    }
    public ListNode sortList1(ListNode head) {
         if (head.next == null) {
        return head;
    }
        ListNode mid=Middle(head);
        ListNode left=sortList1(head);
        ListNode right=sortList1(mid);

        return Merge(left,right);

     
    }
    public ListNode Merge(ListNode h1,ListNode h2) {
        ListNode final1=new ListNode();
        ListNode ans=final1;
        ListNode head1=h1;
        ListNode head2=h2;
        while(head1!=null && head2!=null){
            if(head1.val<head2.val){
                final1.next=head1;
                final1=final1.next;
                head1=head1.next;

            }
            else{
                final1.next=head2;
                final1=final1.next;
                head2=head2.next;

            }
        }
        if(head1==null){
            final1.next=head2;
        }else{
            final1.next=head1;
        }
        return ans.next;
     
    }
    public ListNode Middle(ListNode head) {
        if ( head.next == null) {
        return head;
    }
        
            ListNode fast=head;
            ListNode slow=null;

            ListNode ans=head;
            while(fast!=null &&fast.next !=null){
                slow=slow==null?head:slow.next;
                fast=fast.next.next;
            }
            ans=slow.next;
            slow.next=null;
            return ans;
    }
    
}
public class SortList {
    public static void main(String[] args) {
        
    }
    
}
