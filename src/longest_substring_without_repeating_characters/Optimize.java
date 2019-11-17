package longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Optimize {
    public int lengthOfLongestSubstring(String s){
        int start,cur,maxLength;
        start=cur=maxLength=0;
        Map<Character,Integer> map = new HashMap<>();

        for (;cur<s.length();cur++){
            if (map.containsKey(s.charAt(cur))){
                start = Math.max(start,s.charAt(cur)+1);
            }
            map.put(s.charAt(cur),cur);
            maxLength = Math.max(maxLength,cur-start+1);
        }
        return maxLength;
    }
}
