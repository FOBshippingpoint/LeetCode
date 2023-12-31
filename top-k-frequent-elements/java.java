import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var freqCount = new HashMap<Integer, Integer>();
        
        for (var num : nums) {
            freqCount.put(num, freqCount.getOrDefault(num, -1) + 1);
        }
        
        var bucket = new List[nums.length];
        for (var num : freqCount.keySet()) {
            var freq = freqCount.get(num);
            
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<Integer>();
            }
            bucket[freq].add(num);
        }
        
        var result = new ArrayList<Integer>();
        var j = 0;
        for (var i = bucket.length - 1; i >= 0 && k > 0; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
                k -= bucket[i].size();
            }
        }
       
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
