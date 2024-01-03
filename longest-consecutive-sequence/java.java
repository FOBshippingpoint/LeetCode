class Solution {
    public int longestConsecutive(int[] nums) {
        var set = new HashSet<Integer>();
        
        for (var num : nums) {
            set.add(num);
        }
        
        var longestSeqLen = 0;
        for (var num : set) {
            var isStartOfSeq = !set.contains(num - 1);
            if (isStartOfSeq) {
                var seqLen = 1;
                while (set.contains(num + seqLen)) {
                    seqLen++;
                }
                
                if (seqLen > longestSeqLen) {
                    longestSeqLen = seqLen;
                }
            }
        }
        
        return longestSeqLen;
    }
}
