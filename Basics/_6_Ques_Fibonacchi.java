package Basics;

import java.util.Scanner;

public class _6_Ques_Fibonacchi {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int temp;


        while(count<=n){
            temp = b;
            b = b+ a;
            a = temp;
            count++;
        }

        System.out.println(b);


    }
}
