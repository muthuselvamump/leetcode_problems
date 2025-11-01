import java.lang.Math;
public class Karph_Rapin_String_Matching {
    static int prime=101;
    public static void main(String[] args) {
        String str="java";
        String str1="dsjbfaufjavagbsdjlkhg";
        int target=str.length();
        int search=str1.length();
        int loopend=search-target;
        double targethash=hashing(str);
        double searchhash=hashing(str1.substring(0, target));
        System.out.println(loopend);
        for(int i=0;i<=loopend;i++){
            if(targethash==searchhash){
                
                if(str1.substring(i,i+target).equals(str)){
                    System.out.println("Starting index "+i);
                }
            }
            if(i<loopend){
            searchhash=windowhash(searchhash,target,str1.charAt(i),str1.charAt(i+target));}
        }
        
    }
    public static double hashing(String text){
        double hash=0;
        for(int i=0;i<text.length();i++){
            hash=hash+text.charAt(i)*Math.pow(prime,i);
        }
        return hash;
    }
    public static double windowhash(double oldhash,int add,char removechar,char addchar){
        double hash=(oldhash-removechar)/prime;
        return hash+addchar*Math.pow(prime, add-1);

    }
    
    
}
