package Z_JavaPractice;

public class Patterns {
    public static void main(String[] args) {
        System.out.println("Patterns");

//        ques 1 : solid rectangles

//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                System.out.print(" * ");
//
//            }
//            System.out.println("");
//
//        }

        //        ques 2 : hollow rectangle
//        int n = 4;
//        int m = 5;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=m; j++) {
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   "); // Three spaces to align with " * "
//                }
//            }
//            System.out.println();
//        }



//          //        ques 3 : pyramid starts

        int n=5;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = n; j>=1;j--) {
//                System.out.print(" * ");
//
//            }
//            n--;
//            System.out.println("");
//
//        }


        //        ques 4 : Inverted half pyramid rotated by 180deg

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }


//        questio 5 : half pyramind with number

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
        System.out.println();




        //        question 5 : inverted half pyramid with number

        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i; j++) {
                System.out.print(j+"");

            }
            System.out.println();

        }



//             //        question 5 :floyd pyramid with number
        int num =1;

        for (int i = 1; i <=n ; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print(num+" ");
                num++;

            }
            System.out.println();

        }




    }
}
