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
    public boolean isPalindrome3(int x) {
        if(x<0){
            return false;
        }
        return x==reverseintpalin(x,0);
        
    }
     public int reverseintpalin(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=10*sum+(n%10);
        return reverseintpalin(n/10,sum);
    }
}
public class Palindrome_Number {
    public static void main(String[] args) {
        Solution9 n=new Solution9();
        System.out.println( 45455==n.isPalindrome1(45455, 0) );
        System.out.println( 454==n.isPalindrome1(454, 0) );
        System.out.println(n.isPalindrome3(22222));
        
    }
    
}
