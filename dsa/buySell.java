public class buySell {
    public static int maxProfit(int [] prices){
        int max=0;
        int n=prices.length;
        for(int i=1;i<=n;i++)
        {
            for(int j=i+1;j<=n-1;j++){
                int profit=prices[j]-prices[i];

                if(max<profit){
                    max=profit;


                }
            }
        

            
        }
        return max;

    }
    public static void main(String args[])
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit (Brute Force): " + maxProfit(prices));

    }
    
}
