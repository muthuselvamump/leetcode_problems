class Solution921{
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch ==')'){
                if(!st.isEmpty()&& st.peek()=='('){
                    st.pop();
                }
                else{
                    st.push(ch);
                }

            }
            else{
            st.push(ch);}
        }
        return st.size();
        
    }
}
public class MinimumAdd_to_Make_ParenthesesValid{
    public static void main(String []args){

    }
}