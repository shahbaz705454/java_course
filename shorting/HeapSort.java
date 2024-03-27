package shorting;
import java.util.*;

public class HeapSort {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input size of the array
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();

            // Input array elements
            System.out.println("Enter the elements of the array:");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Perform Heap Sort
            heapSort(arr);

            // Display sorted array
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        public static void heapSort(int[] arr) {
            int n = arr.length;

            // Build heap (rearrange array)
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }

            // One by one extract an element from heap
            for (int i = n - 1; i > 0; i--) {
                // Move current root to end
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Call max heapify on the reduced heap
                heapify(arr, i, 0);
            }
        }

        public static void heapify(int[] arr, int n, int i) {
            int largest = i; // Initialize largest as root
            int left = 2 * i + 1; // left = 2*i + 1
            int right = 2 * i + 2; // right = 2*i + 2

            // If left child is larger than root
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }

            // If right child is larger than largest so far
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            // If largest is not root
            if (largest != i) {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                // Recursively heapify the affected sub-tree
                heapify(arr, n, largest);
            }
        }

}
