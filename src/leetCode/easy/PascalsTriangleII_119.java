package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqi
 * @date 2018/9/7
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 * 下面注释贴上大神操作
 */
public class PascalsTriangleII_119 {
    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            return temp;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0;i<=rowIndex;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            if (i == 1) {
                temp.add(1);
            }
            if (i > 1) {
                for (int j = 1; j <= i - 1; j++) {
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
                temp.add(1);
            }
            result.add(temp);
        }
        return result.get(result.size()-1);
    }
    public static void main(String[] arge){
        int numRows = 10;
        List<Integer> result = getRow(numRows);
        for (int a:result){
            System.out.print(a+" ");
        }
    }

//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> ret = new LinkedList<Integer>();
//        long nk = 1;
//        for (int i = 0; i <= rowIndex; i++) {
//            ret.add((int)nk);
//            nk = nk * (rowIndex - i) / (i + 1);
//        }
//        return ret;
//    }
}
