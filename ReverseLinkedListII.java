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
class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right|| head==null){
            return head;
        }

        ListNode lastnode=null;
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            lastnode=curr;
            curr=curr.next;
        }
        ListNode present=curr;
        for(int i=0;i<(right-left)+1;i++){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        if(lastnode==null){
            head=prev;
        }
        else{
            lastnode.next=prev;
        }
        present.next=curr;

        return head;
        
    }
}
public class ReverseLinkedListII {
    public static void main(String[] args) {
        
    }
    
}
