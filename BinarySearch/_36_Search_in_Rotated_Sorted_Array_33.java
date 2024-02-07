package BinarySearch;

public class _36_Search_in_Rotated_Sorted_Array_33 {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,8,9,0,1,2};
        int target= 7;

        System.out.println(search(arr,target));


//        Finding the target element using binary search after finding pivot


    }
    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot ==-1){
//            it means not rotated array just do normal binary search
            return BinarySearch(nums,target,0,nums.length-1);
        }

        if (nums[pivot] == target){
            return pivot;

        }
        if (target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }else {
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        }


    }

    static int findPivot(int []arr){
      int start = 0;
      int end = arr.length-1;


      while(start<=end) {
          int mid = start + (end -start)/2;

          if (mid<end && arr[mid] > arr[mid+1]){
              return mid;
          }
          if (mid > start && arr[mid] < arr[mid-1] ){
              return mid-1;
          }
          if (arr[mid] <= arr[start]){
              end = mid-1;

          }
          else {
              start = mid +1;
          }


      }
        return -1;

    }

    static int BinarySearch(int [] arr, int target,int start,int end){

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
    static int findPivotDuplicate(int []arr){
        int start = 0;
        int end = arr.length-1;


        while(start<=end) {
            int mid = start + (end -start)/2;

            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
//          if elements is duplicate in start middle and end just skip start and end;
            if (arr[mid]== arr[start] && arr[mid] == arr[end]){


                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;

                }
                end--;

            }else if (arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }


        }
        return -1;

    }
}
