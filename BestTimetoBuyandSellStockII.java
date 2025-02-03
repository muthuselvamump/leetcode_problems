class Solution122 {
    public int maxProfit(int[] prices) {

        int prev=prices[0];
        int min=Integer.MAX_VALUE;
        int profit=0;
        int tp=0;
        int count=0;
        int size=prices.length-1;
        for(int i=0;i<size;i++){
            if(prices[i]<prices[i+1]){

                count++;
            }
        }
        if(count==size){
            return prices[prices.length-1]-prices[0];
        }
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            else if(profit<prices[i]-min){
                profit=prices[i]-min;
                prev=prices[i];

            }
            if(i!=0){
            if(prices[i]<prices[i-1]){
                min=prices[i];
                tp+=profit;
                profit=0;
                System.out.println(prices[i]+" "+profit);

            }
            }

        }
        tp+=profit;
        return tp;
    }
}
public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        
    }
}
