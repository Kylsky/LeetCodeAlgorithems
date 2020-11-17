package remove_duplicates_from_sorted_array;

import java.util.ArrayList;
import java.util.List;

//Runtime: 599 ms, faster than 5.00% of Java online submissions for Remove Duplicates from Sorted Array.
//Memory Usage: 41.1 MB, less than 80.07% of Java online submissions for Remove Duplicates from Sorted Array.
public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        //0,0,1,1,2,2,3,4
        //遍历数组，不一致就result+1
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i=0;i<nums.length;i++) {
            int x = nums[i];
            if (!list.contains(x)){
                list.add(nums[i]);
                nums[result++] = x;
            }else{
                continue;
            }
        }

        return result;
    }
}
