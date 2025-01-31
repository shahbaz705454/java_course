package Z_JavaPractice;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Loops");
        Scanner sc=  new Scanner(System.in);

        for (int i= 0;i<10;i++){
            System.out.println(i);
        }

        int num =0;

        while (num<=10){
            System.out.println(num);
            num++;
        }

//       print the first sum of n numbers

        int sum =0;


        System.out.println("Enter a number");
        int num2 = sc.nextInt();
        for (int i = 0; i <= num2; i++) {

            sum +=i;


        }

        System.out.println("sum of all number is : "+sum);



    }
        }
