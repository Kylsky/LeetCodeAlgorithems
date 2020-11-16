package plus_one;

//执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
//内存消耗：36.9 MB, 在所有 Java 提交中击败了79.15%的用户
public class Solution {
    public int[] plusOne(int[] digits) {
        //[4,3,2,1]
        int flag = 1;
        for (int i =digits.length-1;i>=0;i--){
            digits[i] = digits[i] + flag;
            flag=0;
            if (digits[i]>=10){
                digits[i]=0;
                flag++;
            }
        }
        if (digits[0]==0 && flag==1){
            int[] copy = new int[digits.length+1];
            copy[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                copy[i+1] = digits[i];
            }
            return copy;
        }
        return digits;
    }
}
