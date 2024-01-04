import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            var a = nums[i];

            if (i > 0 && a == nums[i - 1]) {
                continue;
            }

            var left = i + 1;
            var right = nums.length - 1;
            while (left < right) {
                var threeSum = a + nums[left] + nums[right];

                if (threeSum < 0) {
                    left++;
                } else if (threeSum > 0) {
                    right--;
                } else {
                    result.add(List.of(a, nums[left], nums[right]));
                    left++;

                    while (nums[left - 1] == nums[left] && left < right) {
                        left++;
                    }
                }
            }
        }

        return result;
    }
}
