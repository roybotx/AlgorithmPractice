package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/move-zeroes/
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class Move_Zeroes_283 {
    public void moveZeroesN(final int[] nums) {
        int zeroCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            final int num = nums[i];
            if (num == 0) {
                zeroCounter++;
            } else if (zeroCounter != 0) {
                nums[i - zeroCounter] = num;
                nums[i] = 0;
            }
        }
    }

    public void moveZeroesNN(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
            }
        }
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        change(nums, i, j);
                        //so next the point we will look at will be i=j but since i will be increased, that is why we minus 1 here.
                        j = i - 1;
                        break;
                    }
                }
            }

        }

    }

    public void change(int[] nums, int i, int j) {
        int temp = 0;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
