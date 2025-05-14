public class Binary_search_SQRT{
    public static void main(String[] args) {
        System.out.println(bsearchsqrt(40, 3));
        
    }
    public static double bsearchsqrt(int n,int p){
        int s=0;
        int e=n;
        int m=0;
        while(s<=e){
            m=(s+e)/2;
            if(m*m==n){
                return m;
            }
            else if(m*m>n){
                e=m-1;
            }
            else{
                s=m+1;
            }

        }
        double root=e;
        double incre=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incre;
            }
            root-=incre;
            incre/=10;
        }

        return root;
    }
}