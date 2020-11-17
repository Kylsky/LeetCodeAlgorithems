package longest_substring_without_repeating_characters;

import java.util.ArrayList;
import java.util.List;

//No.3 longest-substring-without-repeating-characters
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        for (int i = 0; i < chars.length; i++) {
            int result = 0;
            List<Character> list = new ArrayList<>();
            for (int j = i; j < chars.length; j++) {
                //若已包含，则判断list大小，并更新result值
                if (list.contains(chars[j])) {
                    if (list.size() >= result) {
                        //更新result值；
                        result = list.size();
                        //为最终结果length赋值
                        if (result > length) {
                            length = result;
                        }
                        break;
                    }
                } else{
                    list.add(chars[j]);
                    //更新result
                    result = list.size();
                    //更新length
                    if (result>length){
                        length=result;
                    }
                }
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring(" ");
        System.out.println(i);
    }
}
