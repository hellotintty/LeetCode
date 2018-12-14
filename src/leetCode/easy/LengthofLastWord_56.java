package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/22
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

    If the last word does not exist, return 0.

    Note: A word is defined as a character sequence consists of non-space characters only.

    Example:

    Input: "Hello World"
    Output: 5
 */
public class LengthofLastWord_56 {

    public static int lengthOfLastWord(String s) {
        if (s.length()==0){
            return 0;
        }
        byte[] a = s.getBytes();
        for (int i = a.length-1;i>=0;i--){
            if (a[i]==' '){
                continue;
            }
            if (a[i]!=' '){
                for (int j = i;j>=0;j--){
                    if (a[j]==' '){
                        return i-j;
                    }
                    if (j==0&&j!=' '){
                        return i+1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] arge){
        String s = "day";
        System.out.println(lengthOfLastWord(s));
    }
}
