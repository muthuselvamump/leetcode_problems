import java.util.HashMap;

class Solution1_Brute_Force {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
                return arr;
            }
        }
        return arr;
    }
    class Solution_Optimal_solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> n=new HashMap();
    
            for(int i=0;i<nums.length;i++){
                int sum=target-nums[i];
                if(n.containsKey(sum)){
                    return new int[]{i,n.get(sum)};
                }
                n.put(nums[i],i);
            }
            return new int[]{-1,-1};
        }
    }
}
public class Two_Sum {
    public static void main(String args[]){

    }
    
}
