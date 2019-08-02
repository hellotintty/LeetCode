package leetCode.easy;

/**
 * @auther tianqi
 * @date 2019/8/1 20:22
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 * 备注：无法理解为啥我用的时间很长，查看了用时0ms的答案，复杂度是差不多的。。。
 */
public class ContainsDuplicate2_219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1 || k == 0){
            return false;
        }
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<=i+k&&j<nums.length;j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
//        if (k > nums.length){
//
//        }else if (nums.length%k == 0){
//            //K等分
//
//        }else {
//            //k+1等分
//        }
    }
    public static void main(String[] arge){
        int[] nums = {1,2,3,4,5,6,7,8,9,9};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
