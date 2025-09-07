class Solution20{
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
           
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(c==')'){
                    if(st.isEmpty()||'('!=st.pop()){
                        return false;
                    }
                }
                if(c=='}'){
                    if(st.isEmpty()||'{'!=st.pop()){
                        return false;
                    }

                }
                if(c==']'){
                    if(st.isEmpty()||'['!=st.pop()){
                        return false;
                    }
                }
            }
        }
    
   
        return st.isEmpty();
    }
}
public class Valid_Parentheses {
    public static void main(String[] args) {
        
    }
    
}
