import java.util.*;

class Solution_top_k_element {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
Queue<Map.Entry<Integer,Integer>> q=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            q.add(entry);
            if(q.size()>k){
                q.poll();
            }
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=q.poll().getKey();
        }
        return arr;

        
    }
}
public class TopKFrequentElements {
    public static void main(String args[]){

    }
    
}
