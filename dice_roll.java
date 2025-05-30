import java.util.ArrayList;
import java.util.List;

public class dice_roll {
    public static void main(String[] args) {
        /*dicer("", 4);
        System.out.println();
        diceown("", 4, new int[]{1,3,5,7});*/
        List<List<Integer>> lk=dicerl(new ArrayList<Integer>(), 4, new ArrayList<List<Integer>>());
        System.out.println();
        System.out.println(lk);
    }
    public static void dicer(String p,int up) {
        if(up==0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1;i<=6 && i<=up;i++){
            dicer(p+i, up-i);
        }
        
    }
    public static void diceown(String p,int up,int []arr) {
        if(up==0){
            System.out.print(p+" ");
            return;
        }

        for(int i:arr){
            if(up>=i){
                diceown(p+i, up-i, arr);
            }
        }
        
    }
    public static List<List<Integer>> dicerl(List<Integer> p,int up,List<List<Integer>> list) {
        if(up==0){
            System.out.print(p+" ");
            list.add(p);
            return list;
        }
         List<List<Integer>> ans=null;
        for(int i=1;i<=6 && i<=up;i++){
            ArrayList<Integer> l=new ArrayList<>(p);
            l.add(i);

            ans=dicerl(l,up-i,list);
        }
        return ans;
        
    }
    
}
