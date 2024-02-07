package BinarySearch;

public class _33_Find_the_element_In_sortedArray_of_infinite_Numbers {
    public static void main(String[] args) {
        int [] num= {2,4,6,7,8,9,9,12,23,45,56,76,78,79,90,92,94,95,96,98,99,100,112,115,116};
        int target = 9;
        System.out.println(ans(num,target));


    }

    static int ans(int []nums,int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int temp = end = 1;

            end = end + (end - start + 1) * 2;
            start = temp;

        }
        return BinarySearch(nums,target,start,end);
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


}
