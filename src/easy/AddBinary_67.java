package easy;

import java.util.UUID;

/**
 * @author tianqi
 * @date 2018/6/24
 * Given two binary strings, return their sum (also a binary string).

    The input strings are both non-empty and contains only characters 1 or 0.

    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"

    答案来源：https://blog.csdn.net/cjt5047/article/details/50708902   感谢博主~
 */
public class AddBinary_67 {

    public static String addBinary(String a, String b) {
        String result = "";
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int sum = 0;
        while(aLen>=0 || bLen>=0){
            if(aLen>=0){
                sum +=Integer.parseInt(a.substring(aLen,aLen+1));
                aLen--;
            }
            if(bLen>=0){
                sum +=Integer.parseInt(b.substring(bLen,bLen+1));
                bLen--;
            }
            if(sum==2){
                result = "0" + result;
                sum=1;
            }else if(sum==0 || sum==1) {
                result = sum +"" + result;
                sum = 0;
            }else if(sum==3){
                result = "1" + result;
                sum = 1;
            }
        }
        if(sum==1)
            result = "1" + result;
        return result;
    }

    public static void main(String[] arge){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }
}
