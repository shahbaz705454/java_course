package LinearSearch;

public class _19_SearchInRange {
    public static void main(String[] args) {

        int [] arr = {23,43,5,23,56,64,75,23,464,23,23,12,64};
        int target = 56;
        int ans = Search(arr,target,3,6);
        System.out.println(ans);


    }
    static int Search(int[]arr, int target,int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
            for (int index = start; index <= end; index++) {
                if (target == arr[index]) {
                    return target;
                }


            }
            return -1;

    }
}
