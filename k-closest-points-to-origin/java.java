import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        var queue = new PriorityQueue<int[]>((p1, p2) -> (p1[0] * p1[0] + p1[1] * p1[1]) - (p2[0] * p2[0] + p2[1] * p2[1]));

        for (var point : points) {
            queue.offer(point);
        }

        var result = new int[k][2];
        while (k > 0) {
            result[--k] = queue.poll();
        }

        return result;
    }
}
