package Basics;

import java.util.Arrays;

public class _11_Shadowing_VarArgs {
    static int a = 100; // this variable is shadowed in line 6 because it have higher scope
    public static void main(String[] args) {
        System.out.println(a);
        int a = 30;
        System.out.println(a);

        fun(1,23,5,66,78,54,54,67,43,564,74,343,5663463,6675);








    }
    // VAR ARGS

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
