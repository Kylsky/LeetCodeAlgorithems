package heap;

import java.util.PriorityQueue;

public class HeapExtend {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 6, 4, 5};

        sort(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sort(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(arr.length);
        int i = 0;
        for (;i<=Math.min(arr.length-1,k);i++){
            heap.add(arr[i]);
        }
        int index= 0 ;
        for(;i<arr.length;i++,index++){
            arr[index] = heap.poll();
            heap.add(arr[i]);
        }
        while (!heap.isEmpty()){
            arr[index++] = heap.poll();
        }
        return arr;
    }

//    public static int[] sort(int[] arr, int k) {
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue(arr.length);
//        int i = 0;
//        for (; i <= Math.min(k,arr.length-1); i++) {
//            priorityQueue.add(arr[i]);
//        }
//        int index = 0;
//        for (; i<arr.length;index++,i++) {
//            priorityQueue.add(arr[i]);
//            arr[index] = priorityQueue.poll();
//        }
//        while (!priorityQueue.isEmpty()){
//            arr[index++] = priorityQueue.poll();
//        }
//
//
//        return arr;
//    }
}
