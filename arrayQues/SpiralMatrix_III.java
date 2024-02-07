package arrayQues;
//https://leetcode.com/problems/spiral-matrix-iii/

import java.util.Arrays;

public class SpiralMatrix_III {


    public static void main(String[] args) {

        int[] matrix = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(matrix)));




    }



        public static int[] productExceptSelf(int[] nums) {
            int []ans = new int[nums.length];
            int sum =1;

            for(int i =0;i<nums.length; i++){
                for(int j=0; j<nums.length; j++){

                    if (j!=i){
                        sum =sum*nums[j];

                    }

                }
                ans[i]=sum;
                sum=1;


            }
            return ans;


    }
}
