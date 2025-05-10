public class number_of_digit {
    public static void main(String[] args) {
        System.out.println(countofdigit(255, 10));
        System.out.println(countofdigit(2, 2));
    }
    public static int countofdigit(int n,int b) {
        int count10base= (int)Math.floor(Math.log10(n)+1);

        return (int)Math.floor((Math.log(n)/Math.log(b))+1);
        
        
    }
    public int findNumbers(int[] nums) {
            int ans=0;
            for(int i:nums){
                int  count=0;
               // int n=i;
                while(i>0){
                    i/=10;
                    
                    count++;
                }
                if((count&1)==0){
                    ans++;
                }
    
            }
            return ans;
    
            
        }
    }
