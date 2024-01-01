import java.util.ArrayList;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        var result = new int[nums.length];
        
        var prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        
        var postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        
        return result;
    }
}
