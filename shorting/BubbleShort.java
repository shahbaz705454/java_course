package shorting;

import java.util.Arrays;

public class BubbleShort {
    public static void main(String[] args) {

        int []arr ={5,4,3,2,1};
        bubbleShort(arr);
        System.out.println(Arrays.toString(arr));



    }

    public static void bubbleShort(int []arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i <n ; i++) {
            swapped =false;
            for (int j = 1; j <n-i ; j++) {
                if (arr[j]<arr[j-1]){

                    int temp = arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }

            }
            if (!swapped){
                break;
            }


        }



    }
}
