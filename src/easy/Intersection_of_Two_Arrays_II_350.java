package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class Intersection_of_Two_Arrays_II_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int iL = nums1.length;

        int j = 0;
        int jL = nums2.length;

        int counter = 0;
        int[] results = new int[iL < jL ? iL : jL];

        while (i < iL && j < jL) {
            if (nums1[i] == nums2[j]) {
                results[counter++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(results, counter);
    }

    /**
     * For this one, we can use two pointers.
     * We sort the two arrays first, then move two pointers based on the two values comparison. If two values are the same, bother pointers increase one. If one is smaller than another one, increase the pointer of the smaller one.
     */

    public int[] intersect1(int[] nums1, int[] nums2) {
        List<Integer> resultArray = new ArrayList<>();
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) return new int[0];
        int index1 = 0, index2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] == nums2[index2]) {
                resultArray.add(nums1[index1]);
                index1++;
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }

        int index = 0;
        int[] result = new int[resultArray.size()];
        for (int num : resultArray) {
            result[index++] = num;
        }
        return result;
    }
}
