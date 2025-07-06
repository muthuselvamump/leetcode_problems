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
            
        }
        //top left case
        if(isValid(board,row-2,col-1)){
            
        }

        //left top case
        if(isValid(board,row-1,col-2)){
            
        }

        //right top case
        if(isValid(board,row-2,col+1)){
            
        }



    }
    private static boolean isValid(boolean[][] board, int row, int col) {
        if(0<){

        }

    }
}
