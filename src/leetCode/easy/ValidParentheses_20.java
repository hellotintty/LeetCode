package leetCode.easy;

/**
 * @author tianqi
 * @date 2018/6/12
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Note that an empty string is also considered valid.
 */
public class ValidParentheses_20 {

    public static boolean isValid(String s) {
        byte[] a = s.getBytes();
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]=='['||a[i]=='{'||a[i]=='('){
                for (int j=i;j<a.length;j++){
                    if ((j-i)%2==1){
                        if (a[i]=='['&&a[j]==']'){
                            count++;
                            break;
                        }
                        else if (a[i]=='{'&&a[j]=='}'){
                            count++;
                            break;
                        }
                        else if(a[i]=='('&&a[j]==')'){
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        if (count==a.length/2&&a.length%2==0){
            return true;
        }
        else return false;
    }

    public static void main(String[] arge){
        String a = "()[]{}";
        System.out.println(isValid(a));
    }
}
