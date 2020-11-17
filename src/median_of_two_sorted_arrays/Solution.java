package median_of_two_sorted_arrays;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int l = 0;
        int[] arr = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            arr[l++] = nums1[i]<nums2[j]?nums1[i++]:nums2[j++];
        }

        while (i<=nums1.length-1){
            arr[l++] = nums1[i++];
        }
        while (j<=nums2.length-1){
            arr[l++] = nums2[j++];
        }
        if (arr.length%2!=0){
            return arr[arr.length/2];
        }
        return  ((arr[arr.length/2]+(double)arr[(arr.length/2)-1])/2);
    }


    public static void main(String[] args) {
        int[] a1 = new int[]{1,2};
        int[] a2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(a1,a2));
    }
}
