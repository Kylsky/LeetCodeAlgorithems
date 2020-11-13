package sqrtx;

public class Solution {
    static int s = 0;
    public static int mySqrt(int x) {
        s=x;
        return (int)sqrt(x);
    }

    public static double sqrt(double x){
        double res = (x+s/x)/2;
        if (res==x){
            return res;
        }else {
            return sqrt(res);
        }
    }

    public static void main(String[] args) {
        System.out.println((int)Math.sqrt(2147395600));
        System.out.println(mySqrt(2147395600));;
    }
}
