// User function Template for Java

/* class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}*/

class SolutionGFGfirstnode {
    public static Node findFirstNode(Node head) {
        // code here
        Node fast=head;
        Node slow=head;
        do{
            if(fast==null || fast.next==null){
                return new Node(-1);
            }
            slow=slow.next;
            fast=fast.next.next;
            
        }while(fast!=slow);
        
        fast=head;
        if(fast==slow){
            return fast;
        }
        do{
            fast=fast.next;
            slow=slow.next;
        }while(fast!=slow);
        return slow;
    }
}
public class Find_the_first_node_of_loop_in_linked_list {
    public static void main(String[] args) {
        
    }
    
}
