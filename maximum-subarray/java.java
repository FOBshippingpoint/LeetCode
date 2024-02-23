class Solution {
    public int maxSubArray(int[] nums) {
        var max = nums[0];
        var currSum = 0;

        for (var n : nums) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += n;
            max = Math.max(max, currSum);
        }
        return max;
    }
}
