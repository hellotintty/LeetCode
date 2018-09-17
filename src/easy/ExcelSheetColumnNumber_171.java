package easy;

/**
 * @author tianqi
 * @date 2018/9/17
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber_171 {
    public static int titleToNumber(String s) {
        char[] temp = s.toCharArray();
        int result = 0;
        for (int i = 0;i<temp.length;i++){
            int tempInt = (int)temp[i] -64;
            result = (int) (result+tempInt*Math.pow(26,temp.length-i-1));
        }
        return result;
    }
    public static void main(String[] arge){
        String s = "ZY";
        System.out.println(titleToNumber(s));
    }
}
