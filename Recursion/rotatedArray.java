package Recursion;

public class rotatedArray {
    public static void main(String[] args) {

        int arr[]= {5,6,7,8,1,2,3,4};
        int target = 8;
        System.out.println(searchRotated(arr,target,0,arr.length-1));


    }

    private static int searchRotated(int arr[], int target,int s, int e) {

        if(s>e) {
            return -1;
        }

        int m  = s+(e-s)/2;

        if (target==arr[m]){
                return m;
        }

        if (arr[s]<=arr[m]){
            if (target>=arr[s] && target <=arr[m]){
               return searchRotated(arr,target,s,m-1);
            }else {
               return searchRotated(arr,target,m+1,e);

            }

        }
        if(target>=arr[m] && target<=arr[e]){
            return searchRotated(arr,target,m+1,e);

        }
        return searchRotated(arr,target,s,m-1);
    }

}
