import java.util.ArrayList;
import java.util.List;

class Solution7 {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<String>();
        }
        return letterCombinations("",digits,new ArrayList<>());
        
    }
    public List<String> letterCombinations(String p,String up,List<String> list) {

        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        
        int start=up.charAt(0)-'0';
        int n=3;
        if(up.charAt(0)=='7' || up.charAt(0)=='9'){
            n=4;
        }
        if(up.charAt(0)=='8' || up.charAt(0)=='9'){
            start=((start-2)*3)+1;
        }
        else{
        start=(start-2)*3;
        }
        List<String> lk=null;
        for(int i=0;i<n;i++){
            char c=(char)('a'+(start+i));
            lk=letterCombinations(p+c,up.substring(1),list);


        }
        return lk;
    }
}
public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
         Solution7 n=new Solution7();
         System.out.println(n.letterCombinations("23"));
        
    }
    
}
