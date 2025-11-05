import java.util.Arrays;

public class count_sort_algorithm {
    public static void main(String[] args) {

        int arr[]={4,9,8,2,3,2,5,6,7};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            count[arr[i]]+=1;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
           if(count[i]!=0){
            for(int j=0;j<count[i];j++){
                arr[index++]=i;
            }
        }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(count));
    }
    
}
