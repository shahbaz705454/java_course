package BinarySearch;

import java.util.Arrays;

public class _30_Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    static public int[] createTargetArray(int[] nums, int[] index) {


        int [] target = new int[index.length];

        for (int i = 0; i <index.length ; i++) {

            for (int j = target.length-1; j>index[i] ; j--) {

            target[j]= target[j-1];
        }
            target[index[i]] = nums[i];
        }
        return target;

    }


}


//Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//
//It is guaranteed that the insertion operations will be valid.
//
//
//
//Example 1:
//
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]
