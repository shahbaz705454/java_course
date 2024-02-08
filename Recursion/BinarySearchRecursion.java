package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,8,9,12,54,75,87};
        int tar = 8;
        System.out.println(BinSearch(arr,tar,0,arr.length-1));

    }

    public static int BinSearch(int []arr,int target,int s,int e){

        if(s>e) {
            return -1;
        }

            int m = s+(e-s)/2;

            if(arr[m]==target){
                return m;
            }
            if(target>m){
                return BinSearch(arr,target,m+1,e);
            }
            return BinSearch(arr,target,s,m-1);


    }
}
