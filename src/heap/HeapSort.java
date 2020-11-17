package heap;

//堆排序
public class HeapSort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 1, 2, 4, 1, 2, 3, 4};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
        return arr;
    }

    public static void heapInsert(int[] arr, int start) {
        int num = arr[start];
        while (num > arr[(start - 1) / 2]) {
            swap(arr, start, (start - 1) / 2);
            start = (start - 1) / 2;
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void heapify(int[] arr, int index, int size) {
        int end = size;
        int left = index * 2 + 1;
        while (left < end) {
            int largest = left + 1 < end && arr[left] < arr[left + 1] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, index, largest);
            index = largest;
            left = index * 2 + 1;
        }

    }
}
