public class permutation_recursive {
    public static void main(String[] args) {
        permrecu("", "abc");
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
    
}
