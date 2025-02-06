class Solution274 {
    public int hIndex(int[] citations) {
        int h=0;
        int arr[]=new int[citations.length+1];

        for(int i=0;i<citations.length;i++){
            if(citations[i]>=arr.length-1){
                arr[arr.length-1]+=1;
            }
            else{
                arr[citations[i]]+=1;
            }
        }
         h=arr.length-1;
         System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=1;i--){

            arr[i-1]+=arr[i]; 

            if(h<=arr[i]){
                return h;
            }
            
            h--;

        }
return h;        
    }
}
public class H_index {
    public static void main(String[] args) {
        
    }
    
}
