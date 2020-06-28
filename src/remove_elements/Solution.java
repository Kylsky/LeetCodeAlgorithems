package remove_elements;

//执行用时：0 ms,在所有 Java提交中击败了100.00%的用户
//内存消耗：38.1 MB,在所有 Java提交中击败了5.68%的用户
public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{3,3,2,2,3,3,3,3,4};
        Solution solution = new Solution();
        int length = solution.removeElement(arr,3);
        System.out.println(length);
    }
    public int removeElement(int[] nums, int val) {
        if (nums==null || nums.length==0){
            return 0;
        }
        int i=0;
        int j=0;
        while (j<nums.length){
            if (nums[j]!=val){
                nums[i++] = nums[j++];
            }
            j++;
        }
        return i++;
    }
}
