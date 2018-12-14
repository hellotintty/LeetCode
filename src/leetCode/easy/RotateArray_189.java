package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/10/3
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 */
public class RotateArray_189 {
    public static void rotate(int[] nums, int k) {
        if (k>nums.length){
            k = k%nums.length;
        }
        if (nums.length!=0){
            int[] result = new int[nums.length];
            for (int i = 0;i<nums.length;i++){
                if (i+k>=nums.length){
                    result[i+k-nums.length] = nums[i];
                }else {
                    result[i+k] = nums[i];
                }
            }
            for (int i=0;i<result.length;i++){
                nums[i] = result[i];
            }
        }
    }
    public static void main(String[] areg){
        int[] nums = {};
        int k = 2;
        rotate(nums,k);
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
