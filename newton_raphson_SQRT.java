public class newton_raphson_SQRT {
    public static void main(String[] args) {
        System.out.println(nrsqrt(40));
        
    }
    public static double nrsqrt(int n) {
        double root=n;
        double x=n;
        while(true){
            root=(x+(n/x))/2;
            if(Math.abs(root-x)<0.5){
                break;
            }
            x=root;
        }
        return root;
    }
    
}
