package sort_array_by_parity_ii;

public class Solution2 {
    public int[] sortArrayByParityII(int[] A) {
        int[] ans = new int[A.length];
        int evenIdx = 0;
        int oddIdx = 1;
        for (int i = 0; i < A.length; i++) {
            if ((A[i] & 1) == 1) {
                ans[oddIdx] = A[i];
                oddIdx += 2;
            } else {
                ans[evenIdx] = A[i];
                evenIdx += 2;
            }
        }
        return ans;
    }
}
