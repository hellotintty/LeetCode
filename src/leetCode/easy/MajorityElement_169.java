package leetCode.easy;

import java.util.Arrays;

/**
 * @author tianqi
 * @date 2018/9/17
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 *  * You may assume that the array is non-empty and the majority element always exist in the array.
 *  *
 *  * Example 1:
 *  *
 *  * Input: [3,2,3]
 *  * Output: 3
 *  * Example 2:
 *  *
 *  * Input: [2,2,1,1,1,2,2]
 *  * Output: 2
 *
 * 因为假设必然存在众数。。。所以排序后中位数必然是答案
 */
public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] arge){
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
