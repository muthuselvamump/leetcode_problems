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
    public void reorderList(ListNode head) {
        ListNode hf=head;
        ListNode hs=reverse(Middle(head));
        while(hf!=null && hs !=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null){
            hf.next=null;
        }
       
        
    }
     public ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
        
    }
    public ListNode Middle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

        
    }
}
public class ReorderList {
    public static void main(String args[]){

    }
    
}
