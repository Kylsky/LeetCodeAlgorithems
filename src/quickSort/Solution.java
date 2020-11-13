package quickSort;

public class Solution {
    public static void sort(int[] arr,int left ,int right){
        if (left>=right){
            return;
        }
        int mid = partition(arr,left,right);
        sort(arr,left,mid-1);
        sort(arr,mid+1,right);
    }

    public static int partition(int[] arr,int left,int right){
        if (left > right) {
            return -1;
        }
        if (left == right) {
            return left;
        }
        int R = right;
        int L = left-1;

        while (left<R){
            if (arr[left]==arr[right]){
                left++;
            }
            else if (arr[left]<arr[right]){
                swap(arr,left++,++L);
            }else {
                swap(arr,left,--R);
            }
        }
        swap(arr,L+1,right);
        return L+1;
    }

    public static void swap(int[] arr,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,6,7,5,8,9,3,4};
        sort(arr,0,arr.length-1);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
