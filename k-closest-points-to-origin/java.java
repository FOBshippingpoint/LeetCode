import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        var queue = new PriorityQueue<HeapElement>();

        for (var point : points) {
            var distance = point[0] * point[0] + point[1] * point[1];
            queue.add(new HeapElement(distance, point));
        }

        var result = new int[k][2];
        for (var i = 0; i < k; i++) {
            result[i] = queue.poll().point;
        }

        return result;
    }

    class HeapElement implements Comparable<HeapElement> {
        public int distance;
        public int[] point;

        public HeapElement(int distance, int[] point){
            this.distance = distance;
            this.point = point;
        }

        @Override
        public int compareTo(HeapElement other) {
            return this.distance - other.distance;
        }
    }
}
