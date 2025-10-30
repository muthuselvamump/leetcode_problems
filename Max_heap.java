import java.util.*;
class max{
     ArrayList<Integer> heap1=new ArrayList<>();
    public void insert(int val){
        heap1.add(val);
        int index=heap1.size()-1;

        while(index>0){
            int parent=(index-1)/2;
            if(heap1.get(index)>heap1.get(parent)){
                swap(index,parent);
                index=parent;
            }else{break;}
        }
    }
    public void swap(int a,int b){
        int c=heap1.get(a);
        heap1.set(a,heap1.get(b));
        heap1.set(b,c);
    }
    public void display(){

        System.out.println(heap1.toString());
    }
    public int remove() throws Exception{
        if(heap1.size()==0){
            throw new Exception("heap is empty");
        }
        if(heap1.size()==1){
            return heap1.remove(0);
        }
        int val=heap1.get(0);
        int last=heap1.remove(heap1.size()-1);
        heap1.set(0,last);
        int index=0;
        while(index<heap1.size()){
            int left=(index*2)+1;
            int right=(index*2)+2;
            int max=index;

            if(left<heap1.size() && heap1.get(left)>heap1.get(max)){
                max=left;
            }
            if(right<heap1.size() && heap1.get(right)>heap1.get(max)){
                max=right;
            }
            if(max!=index){
                swap(max,index);
                index=max;
            }
            else{
                break;
            }

        }
        return val;
    }
}
public class Max_heap {
    public static void main(String[] args) {
        max m=new max();
        m.insert(4);
        m.insert(55);
        m.insert(22);
        m.insert(9);
        m.insert(88);
        m.display();
        try {
            m.remove();
            m.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.display();


    }
    
}
