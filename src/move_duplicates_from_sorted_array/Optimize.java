package move_duplicates_from_sorted_array;

import java.util.ArrayList;
import java.util.List;

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
//Memory Usage: 41.7 MB, less than 19.73% of Java online submissions for Remove Duplicates from Sorted Array.
public class Optimize {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j<nums.length){
            if (nums[i]==nums[j]){
                j++;
            }else {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
