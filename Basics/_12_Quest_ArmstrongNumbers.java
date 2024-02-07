package Basics;

import java.util.Scanner;
public class _12_Quest_ArmstrongNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number between 100 to 1000");
//        int n = sc.nextInt();
//        isArmstrong(n);
//        System.out.println(isArmstrong(n));
        for (int i = 100; i<1000 ; i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }



    }




    static boolean isArmstrong(int n){
        int original = n;
        int sum =0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum+rem*rem*rem;

        }
        return sum == original;




    }
}
