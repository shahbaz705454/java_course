package Basics;

import java.util.Scanner;
public class _5_Ques_CaseCheck {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

    char ch = sc.next().trim().charAt(0);
//    TRIM = remove extra space from both sides

        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch);
            System.out.println("LowerCase");

        }else {
            System.out.println(ch);
            System.out.println("UpperCase");
        }


        System.out.println();




    }
}
