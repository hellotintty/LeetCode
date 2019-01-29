package swordOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqi
 * @date 2019/1/29
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class AdjuestmentArray {
    public static void reOrderArray(int [] array) {
        for (int i = 0;i<array.length;i++){
            if (array[i]%2 == 0){
                for (int j = i;j<array.length;j++){
                    if (array[j]%2 == 1){
                        int temp = 0;
                        for (int k = j;k>i;k--){
                            temp = array[k];
                            array[k] = array[k-1];
                            array[k-1] = temp;
                        }
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] arge){
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
