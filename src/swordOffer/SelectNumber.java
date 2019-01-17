package swordOffer;

/**
 * @author tianqi
 * @date 2019/1/14
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class SelectNumber {
    public static boolean Find(int target, int [][] array) {
        if (array.length == 0){
            return false;
        }
        for (int i = 0;i< array.length;i++){
            if (array[i].length == 0){
                return false;
            }
            if (array[i][0]<target){
                for (int j = 0;j<array[i].length;j++){
                    if (array[i][j] == target){
                        return true;
                    }
                    if (array[i][j] > target){
                        break;
                    }
                }
            }
            if (array[i][0] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] arge){
        int[][] arr = {{}};
        int target = 15;
        System.out.println(Find(target,arr));
    }
}
