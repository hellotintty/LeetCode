package sorting_Algorithm;

/**
 * @author tianqi
 * @date 2018/12/11
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] arr,int left,int right){
        if (arr == null || left < 0){
            return;
        }
        if (left < right){
            int index = partition(arr,left,right);
            quickSort(arr,left,index-1);
            quickSort(arr,index+1,right);
        }
    }

    public static int partition(int[] arr,int left,int right){
        int a = left;
        int b = right;
        //将最左边的数作为基数
        int standard = arr[a];
        while (a < b){

            //首先必须从右往左扫描，找到第一个小于基数的数字位置
            while (a < b && standard <= arr[b]){
                b--;
            }
            //从左向右扫描，找到第一个大于基数的数字位置
            while (a < b && standard >= arr[a]){
                a++;
            }
            //将两个位置的数字互换
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        //将左边位置的数字与基数所在位置的数字互换，一定是将左边位置的数字互换，这很重要！
        arr[left] = arr[a];
        arr[a] = standard;
        //返回左位置
        return a;
    }

    public static void main(String[] arge){
        int[] arr = {3,5,1,10,38,46,28,16,5};
        quickSort(arr,0,arr.length-1);
        //结果输出
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
