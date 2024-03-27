package shorting;

import java.util.Scanner;

public class Mergesort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int c = sc.nextInt();
        int arr[] = new int[c];
        System.out.println("Enters numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        int n = arr.length;
        divide(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");

        }
        System.out.println(" ");



    }

    public static void divide(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {

        int merge[] = new int[ei-si+1];
        int indx1 = si;
        int indx2 = mid+1;
        int x = 0;

        while(indx1<=mid && indx2<=ei){

            if (arr[indx1]<=arr[indx2]){
                merge[x++]=arr[indx1++];
            }else{
                merge[x++]=arr[indx2++];
            }
        }

        while(indx1<=mid){
            merge[x++]=arr[indx1++];

        }
        while (indx2<=ei){
            merge[x++]=arr[indx2++];
        }

        for (int i = 0,j=si; i < merge.length ; i++,j++) {

            arr[j]=merge[i];

        }


    }



}
