import java.util.Arrays;

public class n_knightts {
    public static void main(String[] args) {
        
    }
    public static void nknightts(boolean board[][],int kt) {
        if(kt==0){
            System.out.println(Arrays.deepToString(board));
            return;
        }
        
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
