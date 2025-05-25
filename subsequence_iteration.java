import java.util.ArrayList;
import java.util.Arrays;

public class subsequence_iteration {
    public static void main(String[] args) {
        System.out.println(subseqiter("abc"));
    }
    public static ArrayList<String> subseqiter(String str){
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        str=new String(ch);
        
        int start=0;
        int end=0;
        ArrayList<String> outer=new ArrayList<>();
        outer.add("");
        for(int i=0;i<str.length();i++){
            start=0;
            if(i>0 && str.charAt(i)==str.charAt(i-1)){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                String temp=outer.get(j);
                temp+=str.charAt(i);
                outer.add(temp);
            }

        }
        return outer;

        
    }
    
}
