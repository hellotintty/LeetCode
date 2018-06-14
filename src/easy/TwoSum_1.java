package easy;

/**
 * @author tianqi
 * @date 2018/6/6
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

   You may assume that each input would have exactly one solution, and you may not use the same element twice.

   Example:

   Given nums = [2, 7, 11, 15], target = 9,

   Because nums[0] + nums[1] = 2 + 7 = 9,
   return [0, 1].
 */
public class TwoSum_1 {

    public static int[] twoSum(int[] nums, int target) {
        int temp1=0;
        int temp2=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (i!=j){
                    if (nums[i]+nums[j]==target){
                        temp1=i;
                        temp2=j;
                    }
                }
            }
        }
        int[] a=new int[]{temp1,temp2};
        return a;
    }

    public static void main(String[] arge){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
    }
}
