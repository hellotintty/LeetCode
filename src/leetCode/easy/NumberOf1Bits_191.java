package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/11/12
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 * 示例 :
 *
 * 输入: 11
 * 输出: 3
 * 解释: 整数 11 的二进制表示为 00000000000000000000000000001011
 *
 *
 * 示例 2:
 *
 * 输入: 128
 * 输出: 1
 * 解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 */
public class NumberOf1Bits_191 {

    public int hammingWeight(int n) {
        if (n>Integer.MAX_VALUE){
            return 1;
        }
        int result = 0;
        int[] bit = new int[32];
        for (int i=0;n>0;i++){
            int b = n%2;
            n = n/2;
            bit[i] = b;
            if (b ==1){
                result++;
            }
            if (n<2){
                bit[i+1] = n;
            }
        }
        return result;
    }

    public static void main(String[] arge){
        int n = 2147483647;
        System.out.println(new NumberOf1Bits_191().hammingWeight(n));
    }
}
