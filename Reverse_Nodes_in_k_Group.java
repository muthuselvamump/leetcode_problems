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
class Solution25{
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1 || head ==null||head.next==null){
            return head;
        }
        ListNode lastnode=null;
        ListNode newnode=head;
        ListNode prev=null;
        ListNode curr=head;
        int count=getcount(head);
        count=count/k;
       while(count>0){

        for(int i=0;i<k;i++){
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
            

           
        lastnode=newnode;
        count--;
        prev=null;

       
        newnode.next=curr;
        newnode=curr;
    }
        return head;
    }
    public int getcount (ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;

        
    }
}
public class Reverse_Nodes_in_k_Group {
    public static void main(String[] args) {
        
    }
    
}
