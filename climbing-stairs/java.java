class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 1;
        for (var i = 2; i < n; i++) {
            var temp = a + b;
            b = a;
            a = temp;
        }
        return a + b;
    }
}
