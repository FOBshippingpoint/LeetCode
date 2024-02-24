import java.util.ArrayList;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        var mergedIntervals = new ArrayList<int[]>();

        for (var i = 0; i < intervals.length; i++) {
            var interval = intervals[i];
            if (newInterval[1] < interval[0]) {
                mergedIntervals.add(newInterval);
                for (var j = i; j < intervals.length; j++) {
                    mergedIntervals.add(intervals[j]);
                }
                newInterval = null; // No further processing needed
                break;
            } else if (newInterval[0] > interval[1]) {
                mergedIntervals.add(interval);
            } else {
                // Merge overlapping intervals
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        if (newInterval != null) {
            mergedIntervals.add(newInterval);
        }

        var result = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            result[i] = mergedIntervals.get(i);
        }

        return result;
    }
}
