package shorting;

import java.util.Arrays;

public class CyclicShort {
    public static void main(String[] args) {

        int [] arr= {5,3,1,4,2};
        cyclicShort(arr);

        System.out.println(Arrays.toString(arr));



    }
    public static void cyclicShort(int []arr){
         int n = arr.length;
         int i =0;
         while(i<n) {
             int correct = arr[i] - 1;
             if (arr[i] != arr[correct]) {
                 swap(arr, i, correct);
             } else {
                 i++;

             }
         }
    }

    private static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;


    }

}
