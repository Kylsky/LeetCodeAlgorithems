package maxSubArray;

public class Solution {
    public int maxSubArray(int[] nums) {
        //定义最大和用于返回结果
        int res = 0;
        //定义和的中间结果
        int count = nums[0];
        //轮询nums
        for (int num : nums) {
            //count用于表示中间结果，如果存在count小于0的情况，则进入下一个元素重新计算和
            if (count > 0){
                count += num;
            }
            else {
                count = num;
            }
            res = Math.max(count,res);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}