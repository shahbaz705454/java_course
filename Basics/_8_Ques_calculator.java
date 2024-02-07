package Basics;

import java.util.Scanner;
public class _8_Ques_calculator
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int ans = 0;

        while(true) {
            System.out.println("For cancel press X or x");
            System.out.println("Enter operations From ( '+' , '-' , '*' , '/' , '%')");
            char op = sc.next().trim().charAt(0);
            if (op == 'x' || op == 'X'){
                break;
            }
            System.out.println("Enter 1st number ");
            int num1 = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int num2 = sc.nextInt();



            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                } else if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.println("Wrong Operation!!");
                }
                System.out.println(ans);
            }

        }


    }
}
