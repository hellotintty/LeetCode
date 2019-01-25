package swordOffer;

/**
 * @author tianqi
 * @date 2019/1/23
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少
 * 种跳法（先后次序不同算不同的结果）。
 */
public class ComputeStep {
    public static int JumpFloor(int target) {
        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        if (target>2){
            int result=0;
            int x=1,y=2;
            for (int i=2;i<target;i++){
                result = x+y;
                x = y;
                y = result;
            }
            return result;
        }
        return 0;
    }
    public static void main(String[] arge){
        int target = 1;
        System.out.println(JumpFloor(target));
    }
}
