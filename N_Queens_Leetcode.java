import java.util.*;

class Solution51 {
    public List<List<String>> solveNQueens(int n) {
        return nqueensloop(new boolean[n][n],0,new ArrayList<List<String>>());
    }
     public List<List<String>> nqueensloop(boolean board[][],int row,List<List<String>> list) {
        if(board.length==row){
            //System.out.println(Arrays.deepToString(board));
            List<String> l=new ArrayList<String>();
            
            for(boolean[] b:board){
                String s="";
                for(boolean b1:b){
                    if(b1){
                        s+='Q';
                    }
                    else{
                        s+='.';
                    }
                }
                l.add(s);
            }
            list.add(l);
            return list;
        }
        for(int i=0;i<board[0].length;i++){
            if(isSafe(board, row, i)){
                board[row][i]=true;
                nqueensloop(board, row+1,list);
                board[row][i]=false;

            }

        }
        return list;
        
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
public class N_Queens_Leetcode {
 public static void main(String[] args) {
   
    
 }   
    
}

