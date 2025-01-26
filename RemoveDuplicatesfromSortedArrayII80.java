class Solution80{
    public int removeDuplicates(int[] nums) {
        int count=0;
        int prev=-1;
        int k=0;
        prev=nums[0];
        int u=0;
        for(int i=0;i<nums.length;i++){
            if(prev==nums[i]){
                ++u;
            }
            else{
                prev=nums[i];
                u=1;
            }      
            if(u<3){
            nums[count++]=nums[i];
            k++;
            }
      
        }
        return k;
        
    }
}
public class RemoveDuplicatesfromSortedArrayII80{
    static public void main(String args[]){


    }

}