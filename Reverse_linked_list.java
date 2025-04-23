class Solution_inplaceorder {
    public ListNode reverseList(ListNode head) {


        ListNode prev=null;
        ListNode current=head;

        while(current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;


        
    }
}
public class Reverse_linked_list {
    public static void main(String args[]){

    }
    
}
