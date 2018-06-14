package easy;

/**
 * @author tianqi
 * @date 2018/6/11
 * Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
    Note:

    All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix_14 {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder temple = new StringBuilder("");
        if (strs.length>0){
            for (int i=0;i<strs[0].length();i++){
                int flag=0;
                for (int j=0;j<strs.length;j++){
                    if (strs[j].length()>i){
                        if (strs[0].charAt(i)==strs[j].charAt(i)){
                            flag++;
                        }
                    }
                }
                if (flag==strs.length){
                    temple.append(strs[0].charAt(i));
                }else break;
            }
            String a = temple.toString();
            return a;
        }else{
            return "";
        }
    }

    public static void main(String[] arge){
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
