package Basics;

import java.util.Scanner;
public class _10_Scope {
    public static void main(String[] args) {
        random();
        int a = 20;
        int b = 30;
        String name= "shahabz";

//        BLOCK SCOPE
        {
//            int a =10;   // We cannot initialize another variable with the same name as main class
            a = 50 ;   // But we can the value of the variable in the block scope
          int c = 99 ;
            System.out.println(c); // we cant print the value only inside the block code
           name = "shad";
        }
        System.out.println(name);

        int c = 100;// we can initialize a varible if the varible is already initialized inside the block
        System.out.println(c);



      //        System.out.println(c);// we cannot print the value outside the block scope



    }










    //        FUNCTION SCOPE

         static void random() {
             int num1 = 20;
             int num3 = 10;
             int sum = num3 + num1;
             System.out.println(sum);
         }

}

