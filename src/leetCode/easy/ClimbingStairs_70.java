package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/27
 * You are climbing a stair case. It takes n steps to reach to the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Note: Given n will be a positive integer.

    Example 1:

    Input: 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:

    Input: 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step
 */
public class ClimbingStairs_70 {

    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if (n>2){
            int result=0;
            int f1=1,f2=2;
            for (int i=2;i<n;i++){
                result = f1+f2;
                f1 = f2;
                f2 = result;
            }
            return result;
        }
        return 0;
    }

    public static void main(String[] arge){

    }
}
