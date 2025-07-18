import org.w3c.dom.Node;

public class Linked_List_inserting_GFG_recursion {

    public Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null){
            return new Node(x);
        }
        inserting(head,x);
        return head;
        
    }
    public void inserting(Node temp,int x){
        if(temp.next==null){
            Node t=new Node(x);
           // t.data=x;
            temp.next=t;
            return;
        }
        inserting(temp.next,x);
    }
}
    
