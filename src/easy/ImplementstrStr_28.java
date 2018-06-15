package easy;


/**
 * @author tianqi
 * @date 2018/6/15
 * Implement strStr().

    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Example 1:

    Input: haystack = "hello", needle = "ll"
    Output: 2
    Example 2:

    Input: haystack = "aaaaa", needle = "bba"
    Output: -1
    Clarification:

    What should we return when needle is an empty string? This is a great question to ask during an interview.

    For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementstrStr_28 {

    public static int strStr(String haystack, String needle){
        if(""==needle){
            return 0;
        }else return haystack.indexOf(needle);
    }
    public static void main(String[] arge){
        String a = "mississippi";
        String b = "issip";
        System.out.println(strStr(a,b));
    }
}
