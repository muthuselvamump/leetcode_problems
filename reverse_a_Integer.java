public class reverse_a_Integer {
    static int sum=0;
    public static void reverse(int n) {
        if(n==0){
            return;
        }
        sum=10*sum+n%10;
        reverse(n/10);
    }
    public static void main(String[] args) {
        reverse(1354);
        System.out.println(sum);
        System.out.println(reverse2(1354, 0));
    }
    public static int reverse2(int n,int sum1) {
        if(n==0){
            return sum1;
        }
        sum1=10*sum1+n%10;
        return reverse2(n/10,sum1);
    }

    
}
