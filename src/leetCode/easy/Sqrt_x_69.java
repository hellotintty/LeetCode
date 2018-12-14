package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/27
 * Implement int sqrt(int x).

    Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

    Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

    Example 1:

    Input: 4
    Output: 2
    Example 2:

    Input: 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since
    the decimal part is truncated, 2 is returned.
 */
public class Sqrt_x_69 {

    public static int mySqrt(int x) {
        if (x==1) {
            return 1;
        }
        int left = 1;
        int right  = x/2 + 1;
        while (left < right){
            int mid = (left + right)/2;
            if (x/mid >= mid) {
                left = mid +1;
            } else {
                right = mid;
            }
        }
        return right - 1;
    }

    public static void main(String[] arge){
        int x = 2147483647;
        System.out.println(Math.sqrt(2147483647));
        System.out.println(mySqrt(x));
    }
}
