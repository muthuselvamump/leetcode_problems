class Solution189 {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        r(nums,0,nums.length-1);
        r(nums,0,k-1);
        r(nums,k,nums.length-1);
    }
    public void r(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s++]=arr[e];
            arr[e--]=temp;
        }
    }
}
public class RotateArray189 {
    public static void main(String[] args) {
        
    }
    
}
