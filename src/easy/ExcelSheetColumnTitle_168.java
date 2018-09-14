package easy;

/**
 * @author tianqi
 * @date 2018/9/13
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * Example 1:
 *
 * Input: 1
 * Output: "A"
 * Example 2:
 *
 * Input: 28
 * Output: "AB"
 * Example 3:
 *
 * Input: 701
 * Output: "ZY"
 */
public class ExcelSheetColumnTitle_168 {
    public static String convertToTitle(int n) {
        StringBuffer result = new StringBuffer();
        while (n/26 != 0 && n%26 != 0){
            result.append((char)(n%26+64));
            n = n/26;
        }
        while (n/26 !=0 && n%26 == 0){
            result.append("Z");
            n = n/26-1;
        }
        while (n/26 ==0 && n%26 != 0){
            result.append((char)(n+64));
            n = n/26;
        }
        return result.reverse().toString();
    }
    public static void main(String[] arge){
        int n = 701;
        System.out.println(convertToTitle(n));
    }
}
