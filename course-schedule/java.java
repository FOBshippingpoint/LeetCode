import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    HashMap<Integer, ArrayList<Integer>> preMap;
    HashSet<Integer> visitedSet;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        preMap = new HashMap<Integer, ArrayList<Integer>>();
        visitedSet = new HashSet<Integer>();

        for (var i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList());
        }
        for (var pre : prerequisites) {
            preMap.get(pre[0]).add(pre[1]);
        }
        for (var i = 0; i < numCourses; i++) {
            if (!_canFinish(i)) {
                return false;
            }
        }
        return true;
    }

    boolean _canFinish(int course) {
        if (visitedSet.contains(course)) {
            return false;
        }
        if (preMap.get(course).isEmpty()) {
            return true;
        }

        visitedSet.add(course);
        for (var pre : preMap.get(course)) {
            if (!_canFinish(pre)) {
                return false;
            }
        }
        visitedSet.remove(course);
        preMap.get(course).clear();
        return true;
    }
}
