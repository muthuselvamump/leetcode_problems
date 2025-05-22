class Solutionbublegfgrecur {
    public static void bubbleSort(int arr[]) {
        bubblerecur(arr,0,arr.length-1);
    }
    public static void bubblerecur(int arr[],int s,int e){
        if(e==0){
            return;
        }

        if(s<e){
        if(arr[s]>arr[s+1]){
            int temp=arr[s];
            arr[s]=arr[s+1];
            arr[s+1]=temp;
             
        }
        bubblerecur(arr,s+1,e);
        }
        else{
           bubblerecur(arr,0,e-1); 
        }
    }
}
public class bubblesor_recursion {
 public static void main(String[] args) {
 }   
}
