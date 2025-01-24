import java.util.*;
class Solution26{
    public int removeDuplicates(int[] nums) {
        int k=0;
        int count=0;
    HashSet<Integer> h=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        h.add(nums[i]);
    }
    for(int has:h){
        k++;
        nums[count++]=has;
    }
    return k;
    }
}
public class RemoveDuplicatesfromSortedArray26 {

    public static void main(String[] args) {
        
    }
    
}
