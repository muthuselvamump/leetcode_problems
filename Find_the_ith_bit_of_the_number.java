public class Find_the_ith_bit_of_the_number {
    public static void main(String[] args) {
        System.out.println(ithbit(3,2));
    }
    public static int ithbit(int n,int k){

        //3=011 second bit iszero from right

        int base=1<<(k-1);

        int base1=n&base;
        return base1>>(k-1);
        
    }
    
}
