package leetcode.task121;

public class MaxProfit {
    public int maxProfit(int[] prices) {

        int sum = 0, profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            sum += prices[i + 1] - prices[i];
            if (sum < 0) sum = 0;
            else if (sum > profit && sum >= 0) {
                profit = sum;
            }
        }
        return profit;
    }
}
