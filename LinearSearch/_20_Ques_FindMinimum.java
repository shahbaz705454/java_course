package LinearSearch;

public class _20_Ques_FindMinimum {
    public static void main(String[] args) {
//        Find the Minimum element in the array
        int []arr = { 2,34,63,54,2,1,-3,-5,343,23};
        System.out.println(FindMin(arr));



    }
    static int FindMin(int[] arr){
        int min = 0;
        if (arr.length == 0) {
            return -1;
        }

            for (int index = 0; index < arr.length; index++) {

                if (arr[index] < min){
                    min = arr[index];
                }

            }
            return min;

    }
}
