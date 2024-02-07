package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class _16_Ques_Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = {2,3,5,7,32,31,54};
        reverse(arr);
        System.out.println(Arrays.toString(arr));




    }

//    Reverse the array
    static void reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }


    };


//    Swap Function
    public static void swap (int[]arr,int index1,int index2){
        if (index1>arr.length-1){
            System.out.println("Error index 1 is not correct");
        }
        if (index2>arr.length-1){
            System.out.println("Error index 2 is not correct");
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;

    }


}
