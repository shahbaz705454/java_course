package BinarySearch;

public class _26_BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-23,-22,-20,2,3,5,7,20,34,75,77,87};
        int target = 87;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }

    static int BinarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if (target>arr[mid]){
                start =mid+1;

            } else if (target<arr[mid]) {
                end = mid-1;


            }
            else {
                return mid;
            }
        }

        return -1;

    }
}
