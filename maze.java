public class maze {
    public static void main(String[] args) {
        //System.out.println(mazedownadn(3, 3));
        //mazedownadn("", 3, 3);
        System.out.println(" diag part");
        mazediag("", 0, 0, new boolean[3][3]);
        System.out.println(" ALL DIRECTION");
        mazeall("", 0, 0, new boolean[3][3]);
        boolean[][] bool=new boolean[3][3];
        bool[1][1]=true;
        System.out.println(" WITH OBSTACLES");
        mazeobstacles("", 0, 0, bool);
    }
    public static int mazedownandrightcount(int r,int c) {
        if(r==1 || c==1){
            return 1;
        }
        
        
        int countl=mazedownandrightcount(r-1,c);
        int countr=mazedownandrightcount(r,c-1);

        return countl+countr;
        
    }
    public static void mazedownandright(String path,int r,int c) {
        if(r==1 && c==1){
            System.out.println(path);
            return;
        }
        
        if(r>1){
        mazedownandright(path+"D",r-1,c);
        }
        if(c>1){
        mazedownandright(path+"R",r,c-1);
        }
        
    }
     public static void mazediag(String path,int r,int c,boolean bool[][]) {
        if(r==bool.length-1 && c==bool[0].length-1){
            System.out.println(path);
            return;
        }
        
        if(r<bool.length-1){
        mazediag(path+"D", r+1, c, bool);
        }
        if(c<bool[0].length-1){
        mazediag(path+"R", r, c+1, bool);
        }
        if(c<bool[0].length-1 && r<bool.length-1){
            mazediag(path+"X", r+1, c+1, bool);
        }
        
    }
    public static void mazeall(String path,int r,int c,boolean bool[][]) {
        if(r==bool.length-1 && c==bool[0].length-1){
            System.out.println(path);
            return;
        }
        if(bool[r][c]){
            return;
        }
        bool[r][c]=true;
        if(r<bool.length-1){
            
        mazeall(path+"D", r+1, c, bool);
        }
        if(c<bool[0].length-1){
            
        mazeall(path+"R", r, c+1, bool);
        }
        if(c<bool[0].length-1 && r<bool.length-1){
            
            mazeall(path+"X", r+1, c+1, bool);
        }
        if( r>0){
            
            mazeall(path+"U", r-1, c, bool);
        }
        if(c>0){
        
            mazeall(path+"L", r, c-1, bool);
        }
        bool[r][c]=false;
        

        
    }
    public static void mazeobstacles(String path,int r,int c,boolean bool[][]) {
        if(r==bool.length-1 && c==bool[0].length-1){
            System.out.println(path);
            return;
        }
        if(bool[r][c]){
            return;
        }
        if(r<bool.length-1){
            
        mazeobstacles(path+"D", r+1, c, bool);
        }
        if(c<bool[0].length-1){
            
        mazeobstacles(path+"R", r, c+1, bool);
        }
        if(c<bool[0].length-1 && r<bool.length-1){
            
            mazeobstacles(path+"X", r+1, c+1, bool);
        }
    
        

        
    }
        

    
}
