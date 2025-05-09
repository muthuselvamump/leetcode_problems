public class find_the_single_number2_bitcount_solution {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,2,6,3,3,3};
        System.out.println(findsinglenumber(arr));
        
    }
    public static int findsinglenumber(int[] arr) {
        int setbitcount=0;
        int ans=0;
        for(int i=0;i<32;i++){
            for(int num:arr){
                if(((num>>i)&1)==1){
                    setbitcount++;

                }
            }
            if(setbitcount%3!=0){
                ans |=1<<i;
            }
            
        }
        return ans;
        
    }
    
}
