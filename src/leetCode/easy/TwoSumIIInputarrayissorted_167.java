package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/9/12
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSumIIInputarrayissorted_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] resutlr = new int[2];
        for (int i = 0,j = numbers.length-1;i<=j;){
            if (numbers[i]+numbers[j]<target){
                i++;
                continue;
            }
            if (numbers[i]+numbers[j]>target){
                j--;
            }else {
                resutlr[0] = i+1;
                resutlr[1] = j+1;
                return resutlr;
            }
        }
        return null;
    }
    public static void main(String[] arge){
        int[] numbers = {3,24,50,79,88,150,345};
        int target = 200;
        int[] result = twoSum(numbers,target);
        for (int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
