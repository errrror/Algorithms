package sorts;

/**
 * Created by ygz on 16/8/12.
 * My email : gzyang1125@foxmail.com
 */
public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if (target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr,int target,int low,int high){
        if (low>high||target<arr[low]||target>arr[high]) return -1;
        int mid = (low+high)/2;
        if (target==arr[mid]){
            return mid;
        }else if (target<arr[mid]){
            return binarySearch(arr,target,low,mid-1);
        }else{
            return binarySearch(arr,target,mid+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,9));
        System.out.println(binarySearch(arr,9,0,arr.length-1));
    }
}
