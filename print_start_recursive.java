public class print_start_recursive {
    public static void main(String[] args) {
        
        
        printstar2(4, 0);
        System.out.println();
        printstar(3, 0);
    }
    public static void printstar(int r,int c) {
        
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print(" *");
            printstar(r, c+1);

        }
        else{
            System.out.println();
            printstar(r-1, 0);
        }

    }
    public static void printstar2(int r,int c) {
        
        if(r==0){
            return;
        }
        if(r>c){
            printstar2(r, c+1);
            System.out.print("*");
            

        }
        else{
            printstar2(r-1, 0);
            System.out.println();
            
        }

    }
    
}
