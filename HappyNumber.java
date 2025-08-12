class Solution202 {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=squaroot(slow);
            fast=squaroot(squaroot(fast));
            if(fast==1){
                return true;
            }
        }
        while(slow!=fast);
        return false;
    }
    public int squaroot(int n){
        int ans=0;
        while(n>0){
            int nu=n%10;
            ans+=nu*nu;
            n=n/10;
        }
        return ans;

    }
}
public class HappyNumber {
    public static void main(String[] args) {
        
    }
    
}
