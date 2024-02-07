package Basics;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;
public class _13_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Syntax
//        Datatype [] ArrayName = new  Datatype[Size of Array]

        int [] arr = new int[5];
//        int [] arr2 = {2,3,4,6,7,8};
//        System.out.println(arr[1]);
//        System.out.println(arr2[4]);


//        String [] name = {"shahbaz ", "aman", "shad" , "kasif"};
//
//        System.out.println(name[2]);
//        System.out.println(Arrays.toString(name));\




//        INPUT USING LOOPS

        for (int i = 0; i<arr.length; i++ ){
            arr[i] = sc.nextInt();


        }
//        System.out.println(Arrays.toString(arr));

        //OUTPUT USING FOR EACH LOOP
        for (int num : arr){
            System.out.println(num + " ");
        }


    }
}
