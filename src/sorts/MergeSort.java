package sorts;

import java.util.Arrays;

/**
 * Created by YGZ on 2016/4/22.
 * My email : errrrorer@foxmail.com
 */
public class MergeSort {
    public static void sort(int[] arr,int low,int high){
        int mid = (low+high)/2;
        //这里添加一个while循环是为了先对两个数组成的数组进行排列，先两两后四四以此类推；
        if (low<high){
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] tem = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        //将较小的移到新的数组中，直到有一个数组遍历完；
        while (i<=mid&&j<=high){
            if (arr[i]<=arr[j]){
                tem[k++] = arr[i++];
            }else {
                tem[k++] = arr[j++];
            }
        }
        //没有遍历过的数组，将数组剩下的元素移到新数组
        while(i<=mid){
            tem[k++] = arr[i++];
        }
        while(j<=high){
            tem[k++] = arr[j++];
        }
        //把新数组覆盖回原数组；
        for (int k2 = 0;k2<tem.length;k2++){
            arr[k2+low] = tem[k2];
        }
    }
    public static void main(String[] args){
        int[] nums = { 2, 7, 8, 3, 1, 6, 9, 0, 5, 4 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
