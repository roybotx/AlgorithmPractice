package easy; /**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/single-number/
 * 136. Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
public class Single_Number_136 {
    public int singleNumber(int[] nums) {
        // use property of xor, any number xor with 0 is still itself
        // every number xor with itself will be 0
        // eg: 0 ^ 3 ^ 4 ^ 3 = 4
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }
        return xor;
    }
}
