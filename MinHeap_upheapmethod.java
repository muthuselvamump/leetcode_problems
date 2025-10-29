import java.util.ArrayList;
import java.util.NoSuchElementException;

class MinHeap_upheap{
    ArrayList<Integer> heap=new ArrayList<>();
public void insert(int val){
    insert1(val);
}
private void insert1(int val){
    heap.add(val);
    
      int parent;

    int index=heap.size()-1;

    while(index>0){
	
	parent=(index-1)/2;

        if(heap.get(index)<heap.get(parent)){

            int temp=heap.get(index);

            heap.set(index,heap.get(parent));

            heap.set(parent,temp);

        }else{break;}

        index=parent;


    }


}
public int takeback (){
    if (heap.isEmpty()) {
    throw new NoSuchElementException("Heap is empty");
}
    if(heap.size()==1){
        return heap.remove(0);
    }
    int val=heap.get(0);

    int last=heap.remove(heap.size()-1);
    heap.set(0,last);
    int index=0;
    while(index<heap.size()){
        int left=(index*2)+1;
        int right=(index*2)+2;
        int min=index;

        if(left<heap.size() && heap.get(left)<heap.get(min)){
            min=left;
        }
        if(right<heap.size() && heap.get(right)<heap.get(min)){
            min=right;
        }
        if(min!=index){
            int temp=heap.get(index);
                heap.set(index,heap.get(min));
                heap.set(min,temp);
                index=min;
        }
        else{
            break;
        }


    }



    return val;

}
public void display() {
    System.out.println(heap.toString());
}
}
public class MinHeap_upheapmethod {
    public static void main(String[] args) {
        MinHeap_upheap o=new MinHeap_upheap();
        o.insert(12);
o.insert(4);
o.insert(22);
o.insert(52);
o.insert(5);
o.insert(2);
        o.display();
        System.out.println(o.takeback());
        o.display();
    }
    
}
