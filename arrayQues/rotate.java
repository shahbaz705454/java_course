package arrayQues;

import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int n = 9;
        int m=4;

        int ind =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==m){
                ind=i;}
        }


        for(int i =arr.length-1;i>ind;i--){
            arr[i]=arr[i-1];
        }

        arr[ind]=n;

        System.out.println(Arrays.toString(arr));


    }


//

}
