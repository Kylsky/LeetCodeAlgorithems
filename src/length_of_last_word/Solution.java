package length_of_last_word;

//No.58 length-of-last-word
public class Solution {
    public int lengthOfLastWord(String s) {
//            s = s.trim();
//            int start = s.lastIndexOf(" ") + 1;
//            return s.substring(start).length();

        // 不使用indexOf和subString的方法
        int length = 0;
        boolean flag = true;
        for (char by : s.toCharArray()) {
            if (by==' ') {
                flag = false;
            } else if (flag) {
                length++;
            } else {
                length = 0;
                length++;
                flag = true;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        ;
    }
}
