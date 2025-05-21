// User function Template for Java

class Solution {
    int search(int[] arr, int key) {
        return binaryrecur(arr,key,0,arr.length-1);
        // Complete this function
    }
    public int binaryrecur(int []nums,int target,int s,int e){
        if(s>e){
            return -1;
        }
      
        int mid=(s+e)/2;
        if(nums[mid]==target){
            return mid;
        }

        //left

        if(nums[mid]>=nums[s]){
            if(nums[mid]>=target && target>=nums[s]){
                return binaryrecur(nums,target,s,mid-1);
            }
            else{
                return binaryrecur(nums,target,mid+1,e);
            }
        }
        else{
            if(target<=nums[e] && target>=nums[mid]){
                return binaryrecur(nums,target,mid+1,e);
            }
            else{
                
                return binaryrecur(nums,target,s,mid-1);
            }
        }

       // return -1;
    }
}
public class rotated_binary_search_recursive {
 public static void main(String[] args) {
    
 }   
}
