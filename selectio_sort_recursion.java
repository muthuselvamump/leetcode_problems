class Solutiongfgselctionsorting {
    void selectionSort(int[] arr) {
        selctrecursive(arr,0,arr.length,0);
        
    }
    void selctrecursive(int[] arr,int s,int e,int max){
        
        if(e==0){
            return;
        }
        if(s<e){
        if(arr[s]>arr[max]){
            max=s;
        }
        selctrecursive(arr,s+1,e,max);
        }
        else{
            int temp=arr[max];
            arr[max]=arr[e-1];
            arr[e-1]=temp;
            selctrecursive(arr,0,e-1,0);
        }
    }
}
public class selectio_sort_recursion {
    public static void main(String[] args) {
        
    }
    
}
