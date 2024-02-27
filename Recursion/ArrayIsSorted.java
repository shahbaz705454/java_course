package Recursion;

public class ArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {1, 1,1,1,1,1, 4, 6, 8, 9, 13, 115, 1115};
        System.out.println(sorted(arr,0));

    }

    private static boolean sorted(int[] arr, int index) {

       if (index==arr.length-1){
           return true;
       }

       return arr[index]<=arr[index+1] && sorted(arr,index+1);
    }
}
