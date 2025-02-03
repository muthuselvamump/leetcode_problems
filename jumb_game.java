
class Solution55 {
    public boolean canJump(int[] nums) {
    int sl=nums[0];
    for(int i=1;i<nums.length;i++){
        sl--;
        if(sl<0){
            return false;
        }
        if(i==nums.length-1){
            return true;
        }
          if(sl<nums[i]){
            sl=nums[i];
        }
    }
    return true;
    }

}
public class jumb_game{
    public static void main(String[] args) {
        
    }
}