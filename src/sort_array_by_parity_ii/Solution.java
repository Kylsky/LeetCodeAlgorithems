package sort_array_by_parity_ii;

public class Solution {
    public static int[] sortArrayByParityII(int[] A) {
        int i=0;
        while (i<= A.length-1){
            int j =1;
            if ((A[i]&1)!=0){
                for (int k = j; k < A.length; k+=2) {
                    if ((A[k]&1)==0){
                        A[k] = A[i] ^ A[k];
                        A[i] = A[i] ^ A[k];
                        A[k] = A[i] ^ A[k];
                        j+=2;
                        break;
                    }
                }
            }
            i+=2;
        }
        return A;
    }

    public static void swap(int[] arr,int l,int r){

    }
}
