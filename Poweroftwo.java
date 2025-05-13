public class Poweroftwo {
    public static void main(String[] args) {
        System.out.println(powertwo(5));
        System.out.println(powertwo(16));
        
    }
    public static boolean powertwo(int n) {

        return n>0 && (n&(n-1))==0;
        
    }
    
}
