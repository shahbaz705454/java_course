package Recursion;
import java.util.*;

public class quickSOrt {
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

            // Perform Quick Sort
            quickSort(arr, 0, n - 1);

            // Display sorted array
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                // Partition the array
                int pivotIndex = partition(arr, low, high);

                // Recursively sort the sub-arrays
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // Choose pivot as the last element
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Swap arr[i+1] and arr[high] (pivot)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }

