package sorting_Algorithm;

/**
 * @author tianqi
 * @date 2018/12/12
 * 冒泡排序
 * N个元素需要排序N-1轮；
 *
 * 　　第i轮需要比较N-i次；
 *
 * 　　N个元素排序，需要比较n（n-1）/2次；
 *
 * 　　冒泡排序的算法复杂度较高，为O（n*n）
 *
 * 但下文已经有所优化
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int temp = 0;
        int flag = arr.length;
        //如果这一趟没有进行数据交换则结束
        for (int i = 0;i<arr.length;i++){
            flag = 0;
            for (int j = 1;j<arr.length-i;j++){
                //实际就是两个两个往后比，直到最后一位
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = j;
                }
            }
            //如果这一轮没有数据移动，则说明已排序完成
            if (flag == 0){
                break;
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
