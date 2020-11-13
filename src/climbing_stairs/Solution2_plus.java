package climbing_stairs;

//非递归的优化
class Solution2_plus {
    public static int climbStairs(int n) {
        if (n==1||n==2){
            return n;
        }
        int res;
        int count=3;
        int first = 1;
        int second = 2;
        while (count<n){
            res = first+second;
            first = second;
            second = res;
            count++;
        }
        return first+second;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(7));;
    }
}
