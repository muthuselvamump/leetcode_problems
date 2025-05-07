public class Reset_the_ithbit {
    public static void main(String[] args) {
        System.out.println(resetbit(3,2));
    }
    public static int resetbit(int n,int k) {
        int mask=1<<(k-1);
         mask=~mask;
         return n&mask;
        
    }
    
}
