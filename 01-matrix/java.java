import java.util.LinkedList;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        var queue = new LinkedList<int[]>();
        for (var i = 0; i < mat.length; i++) {
            for (var j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    mat[i][j] = -1;
                } else {
                    queue.offer(new int[] { i, j });
                }
            }
        }

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!queue.isEmpty()) {
            var cell = queue.poll();
            for (var dir : directions) {
                var i = cell[0] + dir[0];
                var j = cell[1] + dir[1];
                if (0 <= i && i < mat.length &&
                        0 <= j && j < mat[0].length &&
                        mat[i][j] == -1) {
                    mat[i][j] = mat[cell[0]][cell[1]] + 1;
                    queue.offer(new int[] { i, j });
                }
            }
        }
        return mat;
    }
}
