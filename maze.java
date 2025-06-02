public class maze {
    public static void main(String[] args) {
        //System.out.println(mazedownadn(3, 3));
        //mazedownadn("", 3, 3);
        mazediag("", 0, 0, new boolean[3][3]);
    }
    public static int mazedownadn(int r,int c) {
        if(r==1 || c==1){
            return 1;
        }
        
        
        int countl=mazedownadn(r-1,c);
        int countr=mazedownadn(r,c-1);

        return countl+countr;
        
    }
    public static void mazedownadn(String path,int r,int c) {
        if(r==1 && c==1){
            System.out.println(path);
            return;
        }
        
        if(r>1){
        mazedownadn(path+"D",r-1,c);
        }
        if(c>1){
        mazedownadn(path+"R",r,c-1);
        }
        
    }
     public static void mazediag(String path,int r,int c,boolean bool[][]) {
        if(r==bool.length-1 && c==bool.length-1){
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
        

    
}
