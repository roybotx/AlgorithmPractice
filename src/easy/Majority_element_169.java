package easy;

/**
 * Created by ROYBOTX on 11/15/2016.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Majority_element_169 {
    public int majorityElement(int[] num) {
        int major = num[0], count = 1;
        for (int i = 1; i < num.length; i++) {
            if (count == 0) {
                count++;
                major = num[i];
            } else if (major == num[i]) {
                count++;
            } else count--;
        }
        return major;
    }
    public int majorityElementMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                int count = map.get(i);
                count ++;
                map.put(i, count);
            }else
                map.put(i, 1);
        }
        for(int i: map.keySet())
            if(map.get(i) > nums.length / 2)
                return i;
        return -1;
    }
    public int majorityElementSort(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
