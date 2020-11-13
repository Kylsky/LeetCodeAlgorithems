package climbing_stairs;

//尾递归
public class Solution3 {

    public static int climbStairs(int n) {

        return climbStair(n,1,1);
    }

    public static int climbStair(int n,int first,int second) {
        if (n==1){
            return second;
        }
        return climbStair(n-1,second,first+second);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }



}
