public class number_of_digit {
    public static void main(String[] args) {
        System.out.println(countofdigit(255, 10));
        System.out.println(countofdigit(2, 2));
    }
    public static int countofdigit(int n,int b) {

        return (int)((Math.log(n)/Math.log(b))+1);
        
    }
}
