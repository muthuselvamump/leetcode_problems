public class Find_the_Nth_Magic_number{
    public static void main(String[] args) {
        System.out.println(magic(5));
        
    }
    public static int magic(int n) {

        int pow=5;
        int ans=0;

        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*pow;
            pow=pow*5;
        }
        return ans;
        
    }
}
