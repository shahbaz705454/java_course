package Recursion;

import java.util.Arrays;

public class PrintTriangle {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        triangle(arr);


    }

    public static void triangle(int[] arr) {

        if(arr.length==1){
            return;
        }

        int temp [] = new int[arr.length-1];

        for (int i = 0; i < arr.length-1 ; i++) {

            temp[i]=arr[i]+arr[i+1];
        }

        triangle(temp);
        System.out.println(Arrays.toString(temp));


    }
}
