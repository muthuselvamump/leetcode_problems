import java.util.*;

public class Linear_search_adding_element_in_arraylist {
public static void main(String[] args) {
    int arr[]={7,5,2,4,4,3,4};
    System.out.println(saercinng(arr, 4, 0).toString());
    
}
public static List<Integer> saercinng(int []arr,int Target,int ind){
    List<Integer> list=new ArrayList<>();
    if(arr.length==ind){
        return list;
    }
    if(arr[ind]==Target){
        list.add(ind);
    }
    List<Integer> ans=saercinng(arr, Target, ind+1);
    list.addAll(ans);
    return list;

    
}

}