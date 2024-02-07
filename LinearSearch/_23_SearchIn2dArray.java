package LinearSearch;

import java.util.Arrays;

public class _23_SearchIn2dArray {

    public static void main(String[] args) {


        int[][] arr = {
                {2, 3, 4, 5},
                {4, 7, 99, 64},
                {34, 54, 65}};

//        int target = 32;
//        int []ans = search(arr);
//        System.out.println(Arrays.toString(ans));

        System.out.println(FindMax(arr));

    }

//Searching in 2D array
//static int[] search(int [][]arr,int target) {
//    if (arr.length == 0) {
//        return new int[]{-1,-1};
//
//    }
//    for (int row = 0; row < arr.length; row++) {
//        for (int col = 0; col < arr[row].length; col++) {
//            if (arr[row][col] == target) {
//                return new int[]{row, col};
//            }
//
//        }
//
//
//    }
//    return new int []{-1,-1};
//
//
//}


//Find the maximum element in 2D array
    static int FindMax(int arr[][]){
            int max = Integer.MIN_VALUE;
            int [] narr;

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] > max) {
                        max = arr[row][col];


                    }

                }


            }
            return max;
        }

}
