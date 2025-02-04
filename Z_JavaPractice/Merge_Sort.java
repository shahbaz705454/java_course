package Z_JavaPractice;

public class Merge_Sort {
    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                idx1++;
            } else {
                merged[x] = arr[idx2];
                idx2++;
            }
            x++;
        }

        // Copy remaining elements from left half
        while (idx1 <= mid) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        // Copy remaining elements from right half
        while (idx2 <= ei) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }

        // Copy merged elements back into original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 4, 3, 9, 4, 2, 4, 5};
        divide(arr, 0, arr.length - 1);

        // Corrected output loop
        for (int num : arr) {
            System.out.print(num);
        }
    }
}
