/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class SolutionGFGFLL{
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node fast=head;
        Node slow=head;
        do{
            if(fast==null || fast.next==null){
                return 0;
            }
            fast=fast.next.next;
            slow=slow.next;
            
        }
        while(fast!=slow);
        
        int count=0;
        do{
            slow=slow.next;
            count++;
        }
        while(fast!=slow);
        return count;
        
        // code here.
    }
}
public class FindlengthofLoop{

}