package Basics;

import java.util.Scanner;
public class _4_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int num = 1 ; num <=5; num++){
//            System.out.println(num);
//        }


//        for (int i = 1; i <=n ; i++) {
//            System.out.println(i + " ");
//
//        }
//
//        int n = sc.nextInt();
//        int i = 1;
//        while(i<=n  ){
//            System.out.println(i + " ");
//            i++;
//
//        }




//     Question find the maximum number between 3 numbers

        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//               int max = a;
//              if (b>a){
//                 max = b;
//              }
//              if (c>b){
//                 max =c;
//              }
//        System.out.println(max);
//

//                                          OR

        System.out.println(Math.max(c, Math.max(a,b)));

    }
}
