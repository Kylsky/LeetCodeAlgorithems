package strStr;

//No.28 strStr
public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0){

            return 0;
        }
        if (!haystack.contains(needle)){
            return -1;
        }

        return haystack.indexOf(needle);
    }
}
