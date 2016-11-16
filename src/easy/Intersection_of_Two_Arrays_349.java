package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 */
public class Intersection_of_Two_Arrays_349 {
    public int[] intersectionSet(int[] nums1, int[] nums2) {
        Set<Integer> tmp = new HashSet<>();
        for (int n : nums1) tmp.add(n);
        List<Integer> res = new ArrayList<>();
        for (int n : nums2)
            if (tmp.remove(n))
                res.add(n);
        int[] rr = new int[res.size()];
        for (int i = 0; i < res.size(); i++)
            rr[i] = res.get(i);
        return rr;
    }
}
