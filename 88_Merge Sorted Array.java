class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=0;
        int countk=0;
        int arr[]=new int[m+n];
        int ac=0;
        while(count<m && countk<n){
            if(nums1[count]<nums2[countk]){
                arr[ac++]=nums1[count++];
            }
            else{
                arr[ac++]=nums2[countk++];
            }
        }
            while(count<m || countk <n){
                if(countk<n){
                    arr[ac++]=nums2[countk++];
                }
                else{
                    arr[ac++]=nums1[count++];
                }
            }
            for(int i=0;i<arr.length;i++){
                nums1[i]=arr[i];
            }



        
    }
}