import java.util.PriorityQueue;
import java.util.Queue;

class SolutionKthlargestpattern{
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.poll();
        
    }
}
public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        
    }
    
}
