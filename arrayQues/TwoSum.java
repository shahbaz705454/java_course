package arrayQues;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {-3,4,3,90};
        int target = 0;

        System.out.println(Arrays.toString(add(arr,target)));
    }


    public static int [] add(int [] arr,int target){
        int [] ans = new int [2];
        for (int i = 0 ; i< arr.length-1; i++){

           int sum = 0;
            sum= sum + arr[i];
            for (int j = i+1; j<arr.length; j++){

                if(arr[i]<=target && arr[j]<=target){
                    int num = arr[j];
                    if (sum + arr[j] ==target){
                        ans[0]=i;
                        ans[1]=j;

                        return ans;


                    }



                }

            }
        }

        return ans;
    }


}
