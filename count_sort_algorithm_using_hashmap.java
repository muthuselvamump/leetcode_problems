import java.util.*;
public class count_sort_algorithm_using_hashmap{
    public static void main(String[] args) {
         int arr[]={4,9,8,2,3,2,5,6,7};
         HashMap<Integer,Integer> map=new HashMap<>();
         int max=arr[0];
         for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
         }
         int index=0;
         for(int i=0;i<max+1;i++){
            int val=map.getOrDefault(i,0);
            if(val!=0){
                for(int j=0;j<val;j++){`
                    arr[index++]=i;
                }
            }
         }
         System.out.println(map);
         System.out.println(Arrays.toString(arr));
         

    }

}