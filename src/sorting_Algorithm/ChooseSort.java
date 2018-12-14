package sorting_Algorithm;

/**
 * @author tianqi
 * @date 2018/12/12
 * 选择排序
 * 　　N个元素需要排序N-1轮；
 *
 * 　　第i轮需要比较N-i次；
 *
 * 　　N个元素排序，需要比较n（n-1）/2次；
 *
 * 　　选择排序的算法复杂度仍为O（n*n）；
 *
 * 　　相比于冒泡排序，选择排序的交换次数大大减少，因此速度要快于冒泡排序
 */
public class ChooseSort {
    public static void chooseSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int minIndex = i;
            for (int j = i;j<arr.length;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] arge){
        int[] arr = {3,5,1,9,6,2,7,4};
        chooseSort(arr);
        //打印结果
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
