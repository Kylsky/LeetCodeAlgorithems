package outlook_array;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }else {
            String former = countAndSay(n-1);
            int count = 0;
            String str = "";
            char num = former.charAt(0);
            for (int i = 0; i < former.length(); i++) {
                if (former.charAt(i)==num){
                    count++;
                }else {
                    str+=String.valueOf(count)+num;
                    num = former.charAt(i);
                    count = 1;
                }
            }
            return str+count+num;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String re = solution.countAndSay(4);
        System.out.println(re);
    }
}
