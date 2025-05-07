class Solution_using_xor {
    public int singleNumber(int[] nums) {

        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
        
    }
}
public class SingleNumber {
    public static void main(String[] args) {
        
    }
    
}
