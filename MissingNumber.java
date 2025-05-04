class SolutionCyclicsortalgo {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==i){
                i++;
            }
            else{
                if(nums[i]>=nums.length){
                    i++;
                }
                else{
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;}
            }
        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return nums.length;
    }
}
public class MissingNumber {
    public static void main(String[] args) {
        
    }
    
}
