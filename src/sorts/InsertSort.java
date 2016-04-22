package sorts;

import java.util.Arrays;

/**
 * Created by YGZ on 2016/4/22.
 * My email : errrrorer@foxmail.com
 */
public class InsertSort {
    public static void insertSort(int[] arr){
        if (arr==null||arr.length<2) return;
        //外层循环是从第二个数开始插入
        for (int i=1;i<arr.length;i++){
            int currentVal = arr[i];
            int currentPos = i;
            //内层循环是遍历之前已经排好序的数组
            for (int j=i-1;j>=0;j--){
                //若比待插数大则向后移，指针向前移一个
                if (arr[j]>currentVal){
                    arr[j+1] = arr[j];
                    currentPos--;
                }else {
                    break;
                }
            }
            arr[currentPos] = currentVal;
        }
    }
    public static void main(String[] args){
        int[] array = { 3, -1, 0, -8, 2, 1 };
        InsertSort i = new InsertSort();
        i.insertSort(array);
        System.out.print(Arrays.toString(array));
    }
}
