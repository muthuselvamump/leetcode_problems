class Solution_powerof_number {
    public double myPow(double x, int n) {
        double ans=1;
        long exp=(long)n;
        double base=x;
        if(n<0){
            exp=-exp;
            base=1/base;
        }
        while(exp>0){
            if((exp&1)==1){
                ans *=base;
            }
            base*=base;
            exp=exp>>1;
        }

        return ans;
        
    }
}
public class power_of_a_number {
    public static void main(String[] args) {
        Solution_powerof_number n=new Solution_powerof_number();
        System.out.println(n.myPow(2 ,-4));
        
    }
    
}
