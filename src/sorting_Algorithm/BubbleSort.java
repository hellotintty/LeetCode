package sorting_Algorithm;

/**
 * @author tianqi
 * @date 2018/12/12
 * 冒泡排序
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp = 0;
        int flag = arr.length;
        //如果这一趟没有进行数据交换则结束
        while (flag>0){
            flag = 0;
            for (int i = 1;i<arr.length;i++){
                //实际就是两个两个往后比，直到最后一位
                if (arr[i-1] > arr[i]){
                    temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    flag = i;
                }
            }
        }
    }
    public static void main(String[] arge){
        int[] arr = {3,5,1,9,6,2,7,4};
        bubbleSort(arr);
        //输出结果
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
