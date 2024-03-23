package Recursion;

import java.util.ArrayList;

public class ArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {1, 1,1,1,1,1, 4, 6, 8, 9,4, 13, 115, 1115};
        int target = 4;
//        System.out.println(sorted(arr,0));
        System.out.println(findIndex(arr,target,0,new ArrayList<Integer>()));

    }

    private static boolean sorted(int[] arr, int index) {

       if (index==arr.length-1){
           return true;
       }

       return arr[index]<=arr[index+1] && sorted(arr,index+1);
    }

    static ArrayList<Integer> findIndex(int[] arr,int target,int index,ArrayList<Integer> list){

        if(index == arr.length){
            return list;
        }

        if (target==arr[index]){
          list.add(index);

        }

        return findIndex(arr,target,index+1,list);


    }
}
