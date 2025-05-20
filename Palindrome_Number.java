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
    public int isPalindrome1(int x,int ans){
        if(x==0){
            return ans;
        }
        ans*=10;
        int l=x%10;
        ans+=l;
        
        return isPalindrome1(x/10,ans);

    }
}
public class Palindrome_Number {
    public static void main(String[] args) {
        Solution9 n=new Solution9();
        System.out.println( 45455==n.isPalindrome1(45455, 0) );
        
    }
    
}
