import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        var set = new HashSet<Character>();
        var max = 0;
        var left = 0;

        for (var right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(right - left + 1, max);
        }

        return max;
    }
}
