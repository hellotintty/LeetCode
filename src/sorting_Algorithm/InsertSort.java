package sorting_Algorithm;

/**
 * @author tianqi
 * @date 2018/12/14
 * 插入排序
 * 插入排序的速度约比冒泡排序快一倍（比较次数少一倍），比选择排序还要快一些，
 * 对于基本有序的数据，插入排序的速度会很快，是简单排序中效率最高的排序算法。
 */
public class InsertSort {
    public static void insertSort(int[] arr){
        for (int index = 1;index<arr.length;index++){
            int temp = arr[index];
            int compareIndex = index-1;
            //向前一个个检索，遇到小的则插入并继续向前检索
            while (compareIndex >= 0 && arr[compareIndex] > temp){
                arr[compareIndex+1] = arr[compareIndex];
                compareIndex--;
            }
            arr[compareIndex+1] = temp;
        }
    }
    public static void main(String[] arge){
        int[] arr = {1,3,6,4,8,5,9,7,2};
        insertSort(arr);
        //输出结果
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
