import java.util.Arrays;

public class n_queens {
    public static void main(String[] args) {
        
    }
    public static void nqueens(boolean board[][],int r,int c) {

        if(r>=board.length){
            Arrays.deepToString(board);
            return;
        }
        if(isSafe(board,r,c)){
            
        }
        
    }
    private static boolean isSafe(boolean board[][],int r,int c) {
        //up case
        int ur=r;
        while(ur>=0){
            if(board[ur][c]){
                return false;
            }
            ur--;
        }
        //rd case
        int rdr=r;
        int rdc=c;
        while(rdr>=0 && rdc<board.length){
            if(board[rdr][rdc]){
                return false;
            }
            rdr--;
            rdc++;
        }
         //ld case
        int ldr=r;
        int ldc=c;
        while(ldr>=0 && ldc>=0){
            if(board[ldr][ldc]){
                return false;
            }
            ldr--;
            ldc--;
        }
        return true;
    }
    
}
