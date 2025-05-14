import java.util.ArrayList;

public class factors_of_a_number {
    public static void main(String[] args) {
        factor(20);
        System.out.println();
        factor2(36);
        System.out.println();
        factor3(36);
    }
    public static void factor(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }

        }
        
    }
    public static void factor2(int n) {
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                System.out.print(i+" " +n/i + " ");
                }
            }

        }
        
    }
    public static void factor3(int n) {
        ArrayList<Integer> in=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                System.out.print(i+" ");
                in.add(n/i);
                }
            }

        }
        for(int i=in.size()-1;i>=0;i--){
            System.out.print(in.get(i)+ " ");

        }
        
    }
    
}
