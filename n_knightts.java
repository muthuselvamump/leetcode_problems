import java.util.Arrays;

public class n_knightts {
    public static void main(String[] args) {
        nknightts(new boolean[4][4], 4, 0, 0);
        
    }
    public static void nknightts(boolean board[][],int kt,int row,int col) {
        if(kt==0){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        if(col>=board[0].length){
            nknightts(board, kt, row+1, 0);
            return;
        }
        if(row>=board.length){
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            nknightts(board, kt-1, row, col+1);
            board[row][col]=false;
        }
        nknightts(board, kt, row, col+1);
        
    }
    public static boolean isSafe(boolean board[][],int row,int col){
        //top right case
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
            
        }
        //top left case
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
            
        }

        //left top case
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
            
        }

        //right top case
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
            
        }
        return true;



    }
    private static boolean isValid(boolean[][] board, int row, int col) {
        if(0>row || col<0 || col>=board[0].length || row>=board.length){
            return false;

        }
        return true;

    }
}
