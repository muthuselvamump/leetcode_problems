class Solutiongfgpalindromestring {
    boolean isPalindrome(String s) {
        // code here
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
        
    }
}
public class Plaindrome_String {
    public static void main(String[] args) {
        
    }
    
}
