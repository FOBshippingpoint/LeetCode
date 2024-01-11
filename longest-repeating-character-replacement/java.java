import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int characterReplacement(String s, int k) {
        var left = 0;
        var map = new HashMap<Character, Integer>();
        var maxFreq = 0;

        var result = 0;
        for (var right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            while ((right - left + 1) - maxFreq > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            result = Math.max(right - left + 1, result);
        }

        return result;
    }
}
