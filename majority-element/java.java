class Solution {
    public int majorityElement(int[] nums) {
        var count = 0;
        var majority = nums[0];
        for (var n : nums) {
            if (count == 0) {
                majority = n;
            }
            if (n == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
