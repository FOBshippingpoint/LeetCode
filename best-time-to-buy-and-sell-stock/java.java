class Solution {
    public int maxProfit(int[] prices) {
        var profit = 0;
        var leastPrice = Integer.MAX_VALUE;
        
        for (var price: prices) {
            if (price < leastPrice) {
                leastPrice = price;
            }
            var profitSellToday = price - leastPrice;
            if (profitSellToday > profit) {
                profit = profitSellToday;
            }
        }
        return profit;
    }
}
