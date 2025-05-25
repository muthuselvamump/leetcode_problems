import java.util.ArrayList;

public class subseq_recursive {
    public static void main(String[] args) {
       seqrecurse("", "abc");
       System.out.println();
        System.out.println(seqrecurse2(" ", "abc", new ArrayList<String>()));
        System.out.println(seqrecurseacii("", "abc", new ArrayList<String>()));
    }
    public static void seqrecurse(String p,String up) {
        if(up.length()==0){
            System.out.print(p+ " ");
            return;
        }
        char ch=up.charAt(0);
        seqrecurse(p+ch, up.substring(1));
        seqrecurse(p, up.substring(1));

        
    }
    public static ArrayList<String> seqrecurse2(String p,String up,ArrayList<String> list) {
        if(up.length()==0){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        seqrecurse2(p+ch, up.substring(1),list);
        seqrecurse2(p, up.substring(1),list);
        // seqrecurse2(p+(ch+0), up.substring(1),list);
         return list;

        
    }
    public static ArrayList<String> seqrecurseacii(String p,String up,ArrayList<String> list) {
        if(up.length()==0){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        // seqrecurse2(p+ch, up.substring(1),list);
         seqrecurseacii(p, up.substring(1),list);
         seqrecurseacii(p+(ch+0), up.substring(1),list);
         return list;

        
    }
    
}
