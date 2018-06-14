package easy;

/**
 * @author tianqi
 * @date 2018/6/9
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

    Example 1:

    Input: 121
    Output: true

    Example 2:

    Input: -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:

    Input: 10
    Output: false

    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    Follow up:

    Coud you solve it without converting the integer to a string?
 */
public class PalindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        String tempX =String.valueOf(x);
        if(x < 0){
            return false;
        }else if(x > 0){
            int i=0;
            int j=tempX.length()-1;
            if(i == j){
                return true;
            }
            while(i!=j){
                if(i==j+1){
                    break;
                }else if(tempX.charAt(i)==tempX.charAt(j)){
                    i++;
                    j--;
                }else{
                    break;
                }
            }
            if(i==j||i>j){
                return true;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    public static void main(String[] arge){
        int a = 121;
        System.out.println(isPalindrome(a));
    }
}
