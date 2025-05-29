public class dice_roll {
    public static void main(String[] args) {
        dicer("", 4);
        System.out.println();
        diceown("", 4, new int[]{1,3,5,7});
    }
    public static void dicer(String p,int up) {
        if(up==0){
            System.out.print(p+" ");
            return;
        }
        for(int i=1;i<=6 && i<=up;i++){
            dicer(p+i, up-i);
        }
        
    }
    public static void diceown(String p,int up,int []arr) {
        if(up==0){
            System.out.print(p+" ");
            return;
        }

        for(int i:arr){
            if(up>=i){
                diceown(p+i, up-i, arr);
            }
        }
        
    }
    
}
