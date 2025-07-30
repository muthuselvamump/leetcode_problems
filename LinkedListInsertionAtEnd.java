/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class SolutionGFGinserend {
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
public class LinkedListInsertionAtEnd {
    
}
