public class set_the_ith_bit_of_number {
    public static void main(String[] args) {
        System.out.println(setbit(3,3));
    }
    public static int setbit(int n,int k) {

        int mask=1<<(k-1);
        return n|mask;
        
    }

    
}
