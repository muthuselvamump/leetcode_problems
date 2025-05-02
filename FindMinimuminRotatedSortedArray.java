class Solutionbsearcpivot {
    public int findMin(int[] nums) {
        int pi=pivot(nums);
        if(pi==-1){
            return nums[0];
        }
        return nums[pi+1];
    }
    public int pivot(int []nums){
        int start=0;
        int end=nums.length-1;
        if(nums[start]<nums[end]){
            return -1;
        }
        while(start<end){
            int mid=(start+end)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]<nums[mid]){
                start=mid;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        
    }
    
}
