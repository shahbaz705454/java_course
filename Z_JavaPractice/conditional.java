package Z_JavaPractice;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("hello conditioal");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if (age>18){
            System.out.println("you are adult");
        }else {
            System.out.println("you are not adult");

        }

        System.out.println("enter a number ");
        int num = sc.nextInt();
        if (num % 2 ==0){
            System.out.println("number is even");

        }else {
            System.out.println("number is odd");
        }
    }
}
