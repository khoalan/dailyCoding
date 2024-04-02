package blind.sliding_window;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for (int p:prices){
            if (p < buy) {
                buy = p;
            }
            else {
                profit = Math.max(profit, p - buy);
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,4}));
    }
}
