class Solution {
    public int trap(int[] height) {
        var left = 0;
        var right = height.length - 1;
        var maxL = height[left];
        var maxR = height[right];

        var result = 0;

        while (left < right) {
            if (maxL < maxR) {
                result += Math.max(0, maxL - height[left]);
                // update maxL basd on current position
                left++;
                maxL = Math.max(maxL, height[left]);
            } else {
                result += Math.max(0, maxR - height[right]);
                // update maxR basd on current position
                right--;
                maxR = Math.max(maxR, height[right]);
            }
        }

        return result;
    }
}
