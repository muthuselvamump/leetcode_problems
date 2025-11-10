import java.util.*;
public class Range_quries_algo {
    public static void main(String[] args) {
        int arr[]={3,5,1,6,7,3,5,7};
        int sqrt=(int)Math.sqrt(arr.length);
        System.out.println(sqrt + " "+arr.length);
        int c[]=new int[(arr.length+sqrt-1)/sqrt];
        System.out.println(Arrays.toString(c));
        int blocid=0;
        for(int i=0;i<arr.length;i++){
            if(i!=0 && i%sqrt==0){
                blocid++;
            }
             c[blocid]+=arr[i];
        }
        System.out.println(Arrays.toString(c));

        
    }
    
}
