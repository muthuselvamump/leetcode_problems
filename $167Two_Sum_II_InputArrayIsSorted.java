class Solution167{
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            int left=i;
            int right=numbers.length-1;
            while(left<right){
                int sum=numbers[left]+numbers[right];
                if(sum==target){
                    return new int[]{left+1,right+1};
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return new int[]{-1,-1};
        
    }
}
public class $167Two_Sum_II_InputArrayIsSorted{
    public static void main(String args[]){

    }
}