class ProductOfNumbers {
    ArrayList<Integer> l=new ArrayList<>();
    int count=0;
    int multi=1;

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        l.add(num);
        
    }
    
    public int getProduct(int k) {
        int o=1;
        multi=1;
     //  System.out.println("k"+k);
        for(int i=l.size()-1;i>=l.size()-k;i--){
           // System.out.println(l.get(i) + "ithi"+i);
            o=l.get(i);
            multi=multi*o;
        }
        /*for(int i:l){
            System.out.println("Arra"+i);
        }*/
        
        return multi;
        
    }
    
}
public class Product_of_the_Last_K_Numbers {
    public static void main(String []args){

    }
    
}
