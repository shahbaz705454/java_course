package shorting;

import java.util.Arrays;

public class SelectionShort {
    public static void main(String[] args) {

        int []arr = {33,55,11,66,88,22,1,2,6,3};
        selectionShort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionShort(int []arr){
        int n = arr.length;

        for (int i = 0; i < n ; i++) {
            int last = n - i - 1;

            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static void swap(int[] arr, int first, int last) {

        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i = 0; i <=last ; i++) {

            if(arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }

}
