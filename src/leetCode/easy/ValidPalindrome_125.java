package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqi
 * @date 2018/9/10
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome_125 {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0){
            return true;
        }
        List list = new ArrayList();
        for (char a:s.toCharArray()){
            if (a>=48&&a<=57){
                list.add(a);
            }
            if (a>=65&&a<=90){
                list.add((char)(a+32));
            }
            if (a>=97&&a<=122){
                list.add(a);
            }
        }
        for (int i=0;i<list.size();i++){
            if (!list.get(i).equals(list.get(list.size()-i-1))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arge){
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
