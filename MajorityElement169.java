class Solution169{
    public int majorityElement(int[] nums) {
        int max=0;
        int count=0;
        int prv=nums.length/2;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count>prv){
                max=nums[i];
                return max;
            }
            count=0;

        }
        return max;
        
    }
}
public class MajorityElement169 {
    public static void main(String[] args) {
        
    }
    
}
