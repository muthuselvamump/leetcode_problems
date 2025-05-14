public class Print_1_to_n_without_using_loops {
    public static void main(String []args) {
        printing(8);
        System.out.println();
        System.out.println(fact(5));
        
        
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        
        return n*(fact(n-1));
    }
    static void printing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printing(n-1);
        System.out.print(n+" ");
    }
}
