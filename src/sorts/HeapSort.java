package sorts;

/**
 * Created by YGZ on 2016/4/21.
 * My email : gzyang1125@foxmail.com
 */
public class HeapSort {
    public static void maxHeapify(int[] arr,int heapsize,int i){
        int l = 2*i+1;
        int r = 2*i+2;
        int largest = i;
        if (l<=heapsize&&arr[l]>arr[i]){
            largest = l;
        }
        if (r<=heapsize&&arr[r]>arr[largest]){
            largest = r;
        }
        if (largest!=i){
            int tem = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tem;
            maxHeapify(arr,heapsize,largest);
        }
    }
    public static void buildmaxHeapify(int[] arr){
        for (int i=(arr.length-1)/2;i>=0;i--){
            maxHeapify(arr,arr.length-1,i);
        }
    }
    public static void heapSort(int[] arr){
        buildmaxHeapify(arr);
        for (int i=arr.length-1;i>=1;i--){
            int tem = arr[0];
            arr[0] = arr[i];
            arr[i] = tem;
            maxHeapify(arr,i-1,0);
        }
    }
    public static void main(String[] args){
        int[] arr = {4,1,3,2,16,9,10,14,8,7};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
