import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            var index = map.get(nums[i]);
            if (index != null && index != i) {
                return new int[] {index, i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return null;
    }
}
