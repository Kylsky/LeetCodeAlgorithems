package median_of_two_sorted_arrays;

public class Solution2 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //k是需要找到的元素下标
        int k = (nums1.length+nums2.length)/2;
        if ((nums1.length+nums2.length)%2!=0){
            return calculate(nums1,nums2,k+1);
        }else {
            return (calculate(nums1,nums2,k+1)+calculate(nums1,nums2,k))/2.0;
        }
    }

    public static int calculate(int[] n1,int[] n2,int k){
        int length1 = n1.length;
        int length2 = n2.length;
        int index1 = 0;
        int index2 = 0;

        while (true){
            //遇到边界，则返回另外一个数组的当前下标
            if (index1==length1){
                return n2[index2+k-1];
            }
            if (index2==length2){
                return n1[index1+k-1];
            }
            //k=1，则说明只需返回下一个数，即下标位置的最小值
            if (k==1){
                return Math.min(n1[index1],n2[index2]);
            }

            //普通情况下，移动指针，修改k
            int half = k/2;
            int pointer1 = Math.min(index1+half,length1)-1;
            int pointer2 = Math.min(index2+half,length2)-1;
            int num1 = n1[pointer1];
            int num2 = n2[pointer2];
            if (num1<=num2){
                k-=(pointer1-index1+1);
                index1=pointer1+1;
            }
            else {
                k-=(pointer2-index2+1);
                index2=pointer2+1;
            }
        }
    }
}
