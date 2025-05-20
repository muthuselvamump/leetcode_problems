public class count_zero {
    public static void main(String[] args) {
        System.out.println(count(1201546011));
    }
    public static int count(int num) {
        if(num==0){
            return 1;
        }
        return count1(num);
        
    }
    public static int count1(int num) {
        int c=0;
        if(num==0){
            return c;
        }
        if(num%10==0){
            c+=1;
        }
        c+=count1(num/10);
        return c;
        
    }
    
}
