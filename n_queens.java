import java.util.Arrays;

public class n_queens {
    public static void main(String[] args) {
       // System.out.println(Arrays.deepToString(new int[4][4]));
        nqueens(new boolean[4][4], 0, 0);
        
    }
    public static void nqueens(boolean board[][],int r,int c) {

        if(r==board.length){
           System.out.println(Arrays.deepToString(board));
            System.out.println();
            return;
        }
        if(c>=board[0].length){
            return;
        }
        if(isSafe(board,r,c)){
            board[r][c]=true;
            nqueens(board, r+1, 0);
            board[r][c]=false;
            
        }
        nqueens(board, r, c+1);

        
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
