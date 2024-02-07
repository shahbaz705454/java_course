package Basics;

import java.util.Arrays;
import java.util.Scanner;
public class _14_2D_Arrays  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  /*
        1 2 3 4 5 6
        4 5 3 4 7 4
        8 6 3 1 2 3

*/

        int arr[][] = new int[3][3];
//        int arr2d [][] = {
//
//                { 1,2,3},
//                {4,5,6},
//                {7,8,9,}
//         };

//        TAKING INPUT USING FOR LOOP

//    INPUT
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
//       FOR PRINTING 2D Arrays in Multiple ways
//       OUTPUT 1
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr.length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }

//        Enhance for loop
//        Output 2

//        for (int[] a : arr) {
//            for (int col = 0; col < arr.length; col++) {
//                System.out.print(a[col] + " ");
//
//            }
//            System.out.println();
//
//        }


// OUTPUT 3

//        for (int row = 0; row < arr.length; row++) {
//
//                System.out.println(Arrays.toString(arr[row]));
//
//        }
//                      OR
//        OUTPUT 4

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }




    }
}
