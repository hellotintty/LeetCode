package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/8
 * Given a 32-bit signed integer, reverse digits of an integer.

    Example 1:

    Input: 123
    Output: 321

    Example 2:

    Input: -123
    Output: -321

    Example 3:

    Input: 120
    Output: 21

    Note:
    Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger_7 {
    public static int reverse(int a) {
        int result=0;
        int num=0;
        long temp=0;
        while (a/10!=0){
            num=a%10;
            a=a/10;
            temp=temp*10+num;
            if ((temp*10+a)>Integer.MAX_VALUE-1||(temp*10+a)<Integer.MIN_VALUE){
                result=0;
                a=0;
                break;
            }else result=result*10+num;
        }
        return result*10+a;
    }

    public static void main(String[] arge){
        int a = 123;
        int b = reverse(a);
    }
}
