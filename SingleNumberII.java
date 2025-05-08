class Solution_bitvise_operator {
    public int singleNumber(int[] nums) {

        int ones=0;
        int twos=0;
        for(int ele:nums){
            ones=(ele^ones)&(~twos);
            twos=(ele^twos)&(~ones);
        }
        return ones;
        
    }
}
public class SingleNumberII {
    public static void main(String[] args) {
        
    }
    
}
