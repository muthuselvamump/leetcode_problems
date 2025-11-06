import java.util.Arrays;

public class radix_sort_algo{
    public static void main(String[] args) {
        int arr[]={1,9,345,2};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int exponent=1;
        for(int i=0;i<max/exponent;exponent*=10){
            arr=count_sort(arr,exponent);

        }
    }
    public static int[] count_sort(int[] arr,int exp){
        int[] count=new int[10];
        int ans[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            count[arr[i]/exp%10]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        System.out.println(Arrays.toString(count));
        for(int i=arr.length-1;i>=0;i--){
            ans[count[arr[i]/exp%10]-1]=arr[i];
            count[arr[i]/exp%10]--;
        }
        System.out.println(Arrays.toString(ans));
        System.out.println();

        return ans;


    }
}