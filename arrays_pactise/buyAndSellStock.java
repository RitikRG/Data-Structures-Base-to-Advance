package arrays_pactise;

public class buyAndSellStock {
    
    public static int maxProfit(int[] prices){
        int max=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                max=Math.max(max, profit);
            }else{
                buy=prices[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
