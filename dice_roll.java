public class dice_roll {
    public static void main(String[] args) {
        dicer("", 4);
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
    
}
