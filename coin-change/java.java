import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        var dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (var a = 1; a <= amount; a++) {
            for (var c : coins) {
                if (a - c >= 0) {
                    dp[a] = Math.min(dp[a], dp[a - c] + 1);
                }
            }
        }

        if (dp[amount] != amount + 1) {
            return dp[amount];
        } else {
            return -1;
        }
    }
}
