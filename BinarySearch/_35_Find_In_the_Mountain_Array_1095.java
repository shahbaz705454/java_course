package BinarySearch;

public class _35_Find_In_the_Mountain_Array_1095 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;

        int peak = peakIndexInMountainArray(arr);
        int ans = OrderAgnostic(arr,target,0,peak);
        if (ans != -1){

        }

    }



        static public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length-1;

            while(start<end){
                int mid = start + (end - start)/2;

                if (arr[mid] > arr[mid+1]){
                    end = mid;

                }else {

                    start = mid+1;
                }
            }
            return start;

        }
        static  int OrderAgnostic(int []arr,int target,int start,int end){
            boolean isAsc ;
            if (arr[start]>arr[end]){
                isAsc= false;
            }else{
                isAsc=true;
            }



            while(start<=end){

                int mid = start + (end - start)/2;
                if (target== arr[mid]){
                    return mid;
                }


                if (isAsc) {
                    if (target > arr[mid]) {
                        start = mid + 1;

                    } else {
                        end = mid - 1;


                    }
                }else {
                    if (target < arr[mid]) {
                        start = mid + 1;

                    } else{
                        end = mid - 1;


                    }

                }

            }

            return -1;




        }
}
