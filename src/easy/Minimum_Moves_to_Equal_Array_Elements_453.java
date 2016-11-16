package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

/**
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
 * <p>
 * Example:
 * <p>
 * Input:
 * [1,2,3]
 * <p>
 * Output:
 * 3
 * <p>
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * <p>
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class Minimum_Moves_to_Equal_Array_Elements_453 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];
        for (int i : nums) {
            sum = sum + i;
            if (min > i) min = i;
        }
        sum = sum - nums.length * min;
        return sum;
    }

    public int minMoves1(int[] nums) {
        if (nums.length == 0) return 0;
        int min = nums[0];
        for (int n : nums) min = Math.min(min, n);
        int res = 0;
        for (int n : nums) res += n - min;
        return res;
    }
}
