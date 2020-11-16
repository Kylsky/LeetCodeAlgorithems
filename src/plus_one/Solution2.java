package plus_one;

import java.util.Arrays;

//执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//内存消耗：36.7 MB, 在所有 Java 提交中击败了79.15%的用户

//Solution的优化版本，通过%操作省去了额外的标志位判断
public class Solution2 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
