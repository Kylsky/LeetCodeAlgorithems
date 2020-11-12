package mergeSort;

import java.util.Arrays;

public class Solution {
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (right+left)>>1;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int left, int right) {
        int mid = (right+left)>>1;
        int[] copy = new int[right - left + 1];
        int i = 0;
        int R = mid + 1;
        int L = left;
        while (L <= mid && R <= right) {
            copy[i++] = arr[L] < arr[R] ? arr[L++] : arr[R++];
        }

        while (L<=mid){
            copy[i++] = arr[L++];
        }

        while (R <= right){
            copy[i++] = arr[R++];
        }

        for (int j: copy){
            arr[left++] = j;
        }
    }

    public static void main(String[] args) {
        int[] testArr1 = new int[]{1,3,4,5,2};
        int[] testArr2 = new int[]{1,3,4,5,2};
        Arrays.sort(testArr2);
        sort(testArr1,0,testArr1.length-1);
        for (int i :testArr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(test(testArr1,testArr2));
    }

    public static boolean test(int[] arr1 ,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
