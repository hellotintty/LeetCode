package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqi
 * @date 2018/9/7
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * Example:
 *
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle_118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            if (i == 1){
                temp.add(1);
            }
            if (i>1){
                for (int j =1;j<=i-1;j++){
                    temp.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
                temp.add(1);
            }
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] arge){
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for (List<Integer> row:result){
            for (int a:row){
                System.out.print(a+" ");
            }
            System.out.println("");
        }
    }
}
