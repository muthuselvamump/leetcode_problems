class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int narr=m+n;
        int count=0;
        int countk=0;
        int arrc=0;
        for(int i=0;i<m+n;i++){
            if(count<nums1.length && countk<nums2.length){
                if(nums1[count]<nums2[countk]){
                    if(nums1[count]!=0){
                    arr[arrc++]=nums1[count++];
                    }
                    else{
                        arr[arrc++]=nums2[countk++];
                    }
                }
                else{
                    if(nums2[countk]!=0){
                    arr[arrc++]=nums2[countk++];
                    }
                    else{
                        arr[arrc++]=nums1[count++];
                    }
                }

            }
          

        }
        if(n!=0){
        for(int i=0;i<arr.length;i++){
            nums1[i]=arr[i];
        }
        }

        
    }
}