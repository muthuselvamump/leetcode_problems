class Solution52{
    public int totalNQueens(int n) {
        return nqueensloop(new boolean[n][n],0);
        
    }
     public int nqueensloop(boolean board[][],int row) {
        if(board.length==row){
            return 1;
        }
        int count=0;
        for(int i=0;i<board[0].length;i++){
            if(isSafe(board, row, i)){
                board[row][i]=true;
               count+=nqueensloop(board, row+1);
                board[row][i]=false;

            }

        }
        return count;
        
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
public class n_queens2 {
    public static void main(String[] args) {
        
    }
    
}
