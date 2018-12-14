package leetCode.easy;

import java.util.Arrays;

/**
 * @author tianqi
 * @date 2018/9/10
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber_136 {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i=i+2){
            if (i+1<nums.length){
                if (nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] arge){
        int[] a = {2,2,1};
        System.out.println(singleNumber(a));
    }
}
