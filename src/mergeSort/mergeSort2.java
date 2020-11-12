package mergeSort;

import java.util.Arrays;

public class mergeSort2 {
    public static int sort(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (right+left)>>1;
        return sort(arr, left, mid) + sort(arr, mid + 1, right)+merge(arr, left, right);
    }

    public static int merge(int[] arr, int left, int right) {
        int mid = (right+left)>>1;
        int result = 0;

        int[] copy = new int[right - left + 1];
        int i = 0;
        int R = mid + 1;
        int L = left;
        while (L <= mid && R <= right) {
            //这里的merge默认已经内部有序，因此如果L<R,则L小于右侧所有数
            result += arr[L] < arr[R] ? (right-R+1)*arr[L]:0;
            copy[i++] = arr[L] < arr[R] ? arr[L++] : arr[R++];
        }

        while (L <= mid) {
            copy[i++] = arr[L++];
        }

        while (R <= right) {
            copy[i++] = arr[R++];
        }

        for (int j: copy){
            arr[left++] = j;
        }

//        for (i = 0; i < copy.length; i++) {
//            arr[left + i] = copy[i];
//        }
        return result;
    }

    public static void main(String[] args) {
//        int[] testArr1 = new int[]{};
//        int[] testArr2 = new int[]{3,6,5,7,9,1,2,4,8};
//        Arrays.sort(testArr2);
//        sort(testArr1,0,testArr1.length-1);

//        System.out.println();
//
//        System.out.println(test(testArr1,testArr2));

        int[] arr = {1, 3, 4, 5, 2};
        int res = sort(arr, 0, 4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(res);

    }
}
