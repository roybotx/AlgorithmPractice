package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class Contains_Duplicate_217 {
    /**
     * Bit Manipulation
     */
    public boolean containsDuplicate(int[] nums) {
        byte[] mark = new byte[150000];
        for (int i : nums) {
            int j = i / 8;
            int k = i % 8;
            int check = 1 << k;
            if ((mark[j] & check) != 0) {
                return true;
            }
            mark[j] |= check;
        }
        return false;
    }

    /**
     * Set
     */
    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }
    /**
     * Sort
     */
    public boolean containsDuplicateSort(int[] nums) {

        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }
}
