package leetCode.easy;


/**
 * @author tianqi
 * @date 2018/6/19
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

    Example:

    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

     这道题写到后面把自己写蒙了，太长看不下去
    参考Joseph_buaa博客，感谢答主
 */
public class MaximumSubarray_53 {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }

            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] arge){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
