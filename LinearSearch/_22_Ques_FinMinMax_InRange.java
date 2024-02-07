package LinearSearch;

public class _22_Ques_FinMinMax_InRange {
    public static void main(String[] args) {

            int []arr = { 2,34,63,54,2,1,-3,-5,343,23,9999};
            System.out.println(FindMinRange(arr,2,6));
        System.out.println(FindMaxRange(arr,2,6));




        }
//        for Minimum Range
        static int FindMinRange(int[] arr,int start,int end){
            int min = arr[start];
            if (arr.length == 0) {
                return -1;
            }

            for (int index = start; index <= end; index++) {

                if (arr[index] < min){
                    min = arr[index];
                }

            }
            return min;

        }


//        for Maximum Range

    static int FindMaxRange(int[] arr,int start,int end){
        int max = arr[start];
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {

            if (arr[index] > max){
                max = arr[index];
            }

        }
        return max;

    }



}

