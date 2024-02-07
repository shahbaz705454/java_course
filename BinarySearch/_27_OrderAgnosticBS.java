package BinarySearch;

public class _27_OrderAgnosticBS {

    public static void main(String[] args) {

        int [] arr1={-2,-1,2,3,5,5,6,8,44,65,76,87};
        int [] arr2={99,67,54,34,23,12,8,6,5,4,1,-2};

        int ans = OrderAgnostic(arr1,-2);
        int ans2 = OrderAgnostic(arr2,-2);
        System.out.println(ans);
        System.out.println(ans2);

    }

    static  int OrderAgnostic(int []arr,int target){
        int start = 0;
        int end = arr.length-1;
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
