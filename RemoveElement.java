class Solution27 {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                 k++;
                nums[count++]=nums[i];
            }

        }
        return k;
        
    }
}
public class RemoveElement{
public static void main(String[] args) {
    
}
}