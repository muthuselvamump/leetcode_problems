class Solutionxorrangegfg {
    public static int findXOR(int l, int r) {
        return xorrange(l-1)^xorrange(r);
    }
    public static int xorrange(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        if(n%4==3){
            return 0;
        }
        return 0;
    }
}
public class Find_XOR_of_numbers_from_L_to_R {
    public static void main(String[] args) {
        
    }
    
}
