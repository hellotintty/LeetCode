package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/12/9
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class CountPrimes_204 {
    public static int countPrimes(int n) {
        int result = 0;
        if (n<=2){
            return result;
        }
        for (int i = 2;i<n;i++){
            boolean iszhishu = true;
            double index = Math.sqrt(i);
            for (int j = 2;j<=index;j++){
                if (i%j == 0){
                    iszhishu = false;
                    break;
                }
            }
            if (iszhishu == true){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] arge){
        int n = 3;
        System.out.println(countPrimes(n));
    }
}
