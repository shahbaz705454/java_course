package LinearSearch;

public class _21_Ques_FindMaximum {
    public static void main(String[] args) {
        int []arr = { 2,34,63,54,2,1,-3,-5,343,23,9999};
        System.out.println(FindMax(arr));



    }
    static int FindMax(int[] arr){
        int min = 0;
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {

            if (arr[index] > min){
                min = arr[index];
            }

        }
        return min;

    }
}

