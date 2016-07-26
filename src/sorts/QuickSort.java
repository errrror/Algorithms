package sorts;

/**
 * Created by YGZ on 2016/4/21.
 * My email : gzyang1125@foxmail.com
 */
public class QuickSort {
    public static void quicksort(int[] arr){
        if (arr!=null) {
            quicksort(arr,0,arr.length-1);
        }
    }
    public static void quicksort(int[] arr,int start,int end){
        int p;
        if (start<end){
            p = partition(arr,start,end);
            quicksort(arr,start,p-1);
            quicksort(arr,p+1,end);
        }
    }
    public static int partition(int[] arr,int start,int end){
        int x = arr[end];
        int i = start -1;
        for (int j=start;j<=end-1;j++){
            if (arr[j]<=x){
                i++;
                int tem = arr[j];
                arr[j] = arr[i];
                arr[i] = tem;
            }
        }
        i += 1;
        int tem = arr[i];
        arr[i] = arr[end];
        arr[end] = tem;
        return i;
    }
    public static void main(String[] args){
        int[] arr = {2,5,3,6,7,4};
        QuickSort quickSort = new QuickSort();
        quickSort.quicksort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
