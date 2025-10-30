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
}
public class Max_heap {
    public static void main(String[] args) {
        max m=new max();
       


    }
    
}
