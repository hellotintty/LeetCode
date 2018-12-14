package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/10/13
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example:
 *
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 *              return 964176192 represented in binary as 00111001011110000010100101000000.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 */
@SuppressWarnings({"ALL", "AlibabaClassNamingShouldBeCamel"})
public class ReverseBits_190 {
    public static int reverseBits(int n) {
        int result = 0;
        int i = 0;
        while (i < 32) {
            int temp = n & 0x01;
            n = n >> 1;

            result = (result << 1) | temp;
            i++;
        }
        return result;
    }
    public static void main(String[] arge){
        int a = 1;
        System.out.println(reverseBits(a));
    }
}
