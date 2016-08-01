package sorts;

/**
 * Created by YGZ on 2016/8/1.
 * My email : gzyang1125@foxmail.com
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=arr.length-1;j>=i+1;j--){
                if (arr[j]<arr[j-1]){
                    int tem = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tem;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,7,1,6,9,4,3,8};
        bubbleSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
