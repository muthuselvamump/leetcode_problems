class MyQueue232 {
Stack<Integer> first=new Stack<>();
Stack<Integer> second=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        
    }
    
    public int pop() {
        if(!first.isEmpty()){
            return first.pop();
        }
        return -1;
    }
    
    public int peek() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

public class ImplementQueue_usingStacks {
    public static void main(String[] args) {
        
    }
    
}
