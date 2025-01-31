package Z_JavaPractice;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("hello world ");
        System.out.println("hello world with java");

        int a =5;
        int b=10;
        a= a^b;
        b=a^b;
        a=a^b;
        System.out.println("a value is : "+a);
        System.out.println("b value is : "+ b);

        String name = "shahbaz";
        char names='s';
        System.out.println(name);
        System.out.println(names);
        name ="mohd";
        System.out.println(name);

        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println(name);
    }
}
