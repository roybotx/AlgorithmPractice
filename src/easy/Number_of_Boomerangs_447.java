package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * <p>
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * <p>
 * Example:
 * Input:
 * [[0,0],[1,0],[2,0]]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class Number_of_Boomerangs_447 {
    public int numberOfBoomerangsMap(int[][] p) {
        int n = p.length;
        if (n == 0) return 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (map.containsKey(distance(p[i], p[j]))) {
                    int value = map.get(distance(p[i], p[j]));
                    count += 2 * value;
                    map.put(distance(p[i], p[j]), value + 1);
                } else {
                    map.put(distance(p[i], p[j]), 1);
                }
            }
        }
        return count;
    }

    public Double distance(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
    }
}
