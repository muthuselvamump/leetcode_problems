class Solution121{
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else if(prices[i]-min>profit){
                profit=prices[i]-min;
            }
        }
        return profit;
        
    }
}       
public class BestTimetoBuyandSellStock {
    public static void main(String []args){

    }
    
}
