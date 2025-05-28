import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation_recursive {
    public static void main(String[] args) {
        permrecu("", "abc");
        int []arr={1,2,3};
        List<Integer> l1=Arrays.stream(arr).boxed().toList();
        System.out.println();
        System.out.println(permuter(new ArrayList<>(),l1,new ArrayList<List<Integer>>()));

    }
    public static void permrecu(String p,String up) {
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        for(int i=0;i<p.length()+1;i++){
            String f=p.substring(0, i);
            char ch=up.charAt(0);
            String s=p.substring(i,p.length());
            permrecu(f+ch+s, up.substring(1));
        }
    }

    public static List<List<Integer>> permuter(List<Integer> p,List<Integer> up,List<List<Integer>> list) {
        if(up.size()==0){
            list.add(p);
            return list;
        }
        
        for(int i=0;i<p.size()+1;i++){
        ArrayList<Integer> n=new ArrayList<>(p);
        ArrayList<Integer> nq=new ArrayList<>(up);
            n.add(i,nq.remove(0));
            permuter(n,nq,list);
        }
        return list;

       
    }
}
