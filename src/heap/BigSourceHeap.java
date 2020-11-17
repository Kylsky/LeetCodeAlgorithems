package heap;

//最大堆的根节点删除及转换
public class BigSourceHeap {
    public static int test(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[arr.length-1];
        int start = 0;
        int index = arr.length-2;
        int left = start*2+1;
        while (left < arr.length) {
            int biggest = left+1<index && arr[left]<arr[left+1]? left+1:left;
            if (arr[biggest]==arr[start]){
                break;
            }
            swap(arr,start,biggest);
            start = biggest;
            left = start*2+1;
        }
        return tmp;
    }

    public static void swap(int[] arr ,int a,int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    public static void main(String[] args) {
        int result = test(new int[]{9,8,7,6,5});
        System.out.println(result);
    }
}
