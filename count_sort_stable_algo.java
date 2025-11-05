import java.util.Arrays;

public class count_sort_stable_algo {
    public static void main(String[] args) {

        int []arr={3,5,7,12,8,4,9,8,1};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //cumulative arr
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            ans[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        System.out.println(Arrays.toString(ans));
        
    }
    
    
}
