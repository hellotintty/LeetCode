package easy;

import java.math.BigInteger;

/**
 * @author tianqi
 * @date 2018/9/18
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes_172 {

    public static int trailingZeroes(int n) {
        int result =0;
        while (n>0){
            result = result+n/5;
            n = n/5;
        }
        return result;
    }

    public static void main(String[] arge){
        int i = 5;
        System.out.println(trailingZeroes(i));
    }
}
