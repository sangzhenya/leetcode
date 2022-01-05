package other;

/**
 * @author xinyue
 */
public class Sort {
    public static void main(String[] args) {}

    public static void sort(int[] arr) {}

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIdx = partition(arr, left, right);
            quickSort(arr, left, partitionIdx - 1);
            quickSort(arr, partitionIdx + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = left;
        int idx = pivot + 1;
        for (int i = idx; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, idx);
                idx++;
            }
        }
        swap(arr, pivot, idx - 1);
        return idx - 1;
    }

    private static int partition2(int[] arr, int left, int right) {
        int p = left;
        int idx = p + 1;
        for (int i = idx; i <= right; i++) {
            if (arr[i] < arr[p]) {
                swap(arr, i, idx);
                idx++;
            }
        }
        swap(arr, p, idx - 1);
        return idx - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
