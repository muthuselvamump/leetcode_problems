/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     Lis582'\

 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int count=getcount(head);
       int mcount=k%count;
       if(mcount==0){
        return head;
       }

       count=count-mcount;
       System.out.println(count);
        ListNode prev=null;
        ListNode curr=head;
        for(int i=0;i<count;i++){       
                prev=curr;
                curr=curr.next;
            
        }
        ListNode temp=curr;
        while(curr!=null &&curr.next!=null){
            curr=curr.next;
        }
        prev.next=null;
         curr.next=head;
         head=temp;
           
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
public class Rotate_List {
    public static void main(String[] args) {
        

    }
    
}
