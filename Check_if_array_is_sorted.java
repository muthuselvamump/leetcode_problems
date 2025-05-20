class Solutionchecksorted {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        return array(arr,0);
        
    }
    public boolean array(int arr[],int ind){
        
        if(ind==arr.length-1){
            return true;
        }
        if(arr[ind]>arr[ind+1]){
            return false;
        }
        return array(arr,ind+1);
        
        
    }
}
public class Check_if_array_is_sorted {
    public static void main(String[] args) {
        
    }
    
}
