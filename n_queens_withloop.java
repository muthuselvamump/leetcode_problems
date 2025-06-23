import java.util.Arrays;

public class n_queens_withloop {
    public static void main(String[] args) {
        nqueensloop(new boolean[4][4], 0);
        
    }
    public static void nqueensloop(boolean board[][],int row) {
        if(board.length==row){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        for(int i=0;i<board[0].length;i++){
            if(isSafe(board, row, i)){
                board[row][i]=true;
                nqueensloop(board, row+1);
                board[row][i]=false;

            }

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
