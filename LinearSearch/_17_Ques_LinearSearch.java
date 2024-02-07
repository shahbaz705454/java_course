package LinearSearch;

import java.util.Scanner;

public class _17_Ques_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2,3,5,23,56,76,-56,-23,-54,23,67,45,23,675,4647,345};
        int target = 3;

        System.out.println(LinearSearch(arr,target));



//        Searching in the array

        }
        //        search in array If the element is found return index value else return -1
//            static int LinearSearch(int[] arr,int target) {
//             if (arr.length == 0){
//                 return -1;
//             }
//                for (int index = 0; index < arr.length; index++) {
//                    int element = arr[index];
//                    if (element == target) {
//                        return index;
//                    }
//
//                }
//                return -1;
//                 }

////   --------------- Search in array If the element is found return that element else return false
//              static int LinearSearch(int[] arr,int target) {
//           if (arr.length == 0){
//        return Integer.MAX_VALUE;
//    }
//         for (int index = 0; index < arr.length; index++) {
//           int element = arr[index];
//           if (element == target) {
//            return element;
//        }

//             }
//            return Integer.MAX_VALUE;
//             }

//  ----------------- search in array If the element is found return that true else return false
                  static boolean LinearSearch(int[] arr,int target) {
                      if (arr.length == 0){
                          return false;
                      }
                      for (int index = 0; index < arr.length; index++) {
                          int element = arr[index];
                          if (element == target) {
                              return true;
                          }

                      }
                      return false;




}
}
