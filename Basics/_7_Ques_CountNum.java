package Basics;

import java.util.Scanner;
public class _7_Ques_CountNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        System.out.println("enter the number you want find" );
//        int find = sc.nextInt();
//        int count = 0;
//
//        while(n>0){
//            if (n%10 == find){
//                count ++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);
//
//



//        Question 2  Reverse the number and print them

        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp = 0 ;

        while (n>0){
            temp =temp * 10 + (n%10);
            n = n/10;

        }
        System.out.println(temp);



    }
}
