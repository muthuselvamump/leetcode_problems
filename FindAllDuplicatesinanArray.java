import java.util.*;

class SolutionCyclicsortalgofd {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if((nums[i]-1)==i){
                i++;
            }
            else{
                int temp=nums[i];
                if(nums[i]==nums[temp-1]){
                    i++;
                }
                else{
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;}
            }
        }

        for(int j=0;j<nums.length;j++){
            if((nums[j]-1)!=j){
                ans.add(nums[j]);
            }
        }
        
        return ans;
        
    }
}
public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        
    }
    
}
