class Solution9 {
    public boolean isPalindrome(int x) {
        String str1=Integer.toString(x);
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        System.out.println(str1 +" " +str2);
        return str1.equals(str2);
        
    }
}
public class Palindrome_Number {
    public static void main(String[] args) {
        
    }
    
}
