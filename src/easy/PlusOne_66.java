package easy;

import java.util.List;
import java.util.Stack;

/**
 * @author tianqi
 * @date 2018/6/23
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

    You may assume the integer does not contain any leading zero, except the number 0 itself.

    Example 1:

    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Example 2:

    Input: [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    方法比较笨，需要经过两次转换。可以考虑不转换直接做的
 */
public class PlusOne_66 {

    public static int[] plusOne(int[] digits) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i <digits.length ; i++) {
            str = str.append(digits[i]);
        }
        int index = Integer.parseInt(str.substring(str.length()-1));
        if (index<9){
            index = index+1;
            str.replace(str.length()-1,str.length(),String.valueOf(index));
        }else{
            int i=1;
            int temp=0;
            do {
                str.replace(str.length()-i,str.length()-i+1,String.valueOf("0"));
                i++;
                if (i>str.length()){
                    break;
                }
                temp = Integer.parseInt(str.substring(str.length()-i,str.length()-i+1));
                temp = temp+1;
                if (temp==10){
                    str.replace(str.length()-i,str.length()-i+1,String.valueOf("0"));
                }else{
                    str.replace(str.length()-i,str.length()-i+1,String.valueOf(temp));
                }
            }while (temp==10);
            if (Integer.parseInt(str.substring(0,1))==0){
                str.insert(0,1);
            }
        }
        int[] result = new int[str.length()];
        for (int i=0;i<str.length();i++){
            result[i] =Integer.parseInt(str.substring(i,i+1));
        }
        return result;
    }

    public static void main(String[] arge){
        int[] a = new int[]{4,3,2,1};
        plusOne(a);
    }
}
