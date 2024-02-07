package Strings;

public class Pattern {

    public static void main(String[] args) {

//1.  *****
//    *****
//    *****
//    *****
//    *****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//
//            }
//            System.out.println("");
//
//        }




//------------------------------------------------------------------------------------------------
// 2.       *
//         **
//        ***
//        ****
//        *****

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//
//
//                }
//            System.out.println();
//
//            }



//---------------------------------------------------------------------------------------------------------------


//        3.  *****
//            ****
//            ***
//            **
//            *
//        int n =5;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n-i+1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//
//            }

//        4.  1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5


//        for (int row = 1; row <=5; row++) {
//            for (int col = 1; col <=row; col++) {
//                System.out.print(col+" ");
//
//            }
//            System.out.println();
//        }



//        5.  *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *
        int n =5;
        for (int row = 0; row <2*n; row++) {
            int ColsRow = row>n ? 2*n -row : row ;
            for (int col = 0; col <ColsRow; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }















    }








    }

