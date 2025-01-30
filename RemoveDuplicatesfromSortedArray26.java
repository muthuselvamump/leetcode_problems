import java.util.*;
class Solution26 {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int count=0;
        int prev=Integer.MAX_VALUE;
        if(nums.length==1){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=prev){
                prev=nums[i];
                nums[count++]=nums[i];
                k++;
            }
        }

         return k;
    }
}
public class RemoveDuplicatesfromSortedArray26 {

    public static void main(String[] args) {
        
    }
    
}
