class Solution45 {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int cover=0;
        int lastintex=0;
        int jumb=0;
        for(int i=0;i<nums.length;i++){
            if(cover<nums[i]+i){
                cover=nums[i]+i;
            }
            if(lastintex==i){
                lastintex=cover;
                jumb++;
            
            if(cover>=nums.length-1){
                return jumb;
            }
        }
        }
        return jumb;
    }
}
public class jumb_game2 {
    public static void  main(String args[]){

    }
    
}
