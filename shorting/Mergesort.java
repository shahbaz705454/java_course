package shorting;

public class Mergesort {

    public static void main(String[] args) {
        int arr[] = { 6,3,8,9,2,3,4};
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
