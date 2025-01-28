class Solution121 {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int index=0;
        for(int i=0;i<1;i++){
            for(int j=0;j<prices.length;j++){
                if(prices[j]<min){
                    min=prices[j];
                    index=j;
                }
            }
        }
        for(int i=0;i<1;i++){
        for(int k=index;k<prices.length;k++){
            if(max<prices[k]){
                max=prices[k];
            }
        }
        }
        if(min>max){
            return 0;
        }
        else{
            return max-min;
        }

        
    }
}
        
public class BestTimetoBuyandSellStock {
    public static void main(String []args){

    }
    
}
