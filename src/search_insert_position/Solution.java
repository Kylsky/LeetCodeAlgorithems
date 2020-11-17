package search_insert_position;

//No.35 search-insert-position
//执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
//内存消耗：39.4 MB, 在所有 Java 提交中击败了5.55%的用户
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i =0;i<nums.length;i++){
            if (nums[i] == target){
                return i;
            }
            if (target>nums[i]){
                index++;
            }
        }
        return index;
    }
}
