package arrayQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        int[][] arr = {{3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}};

        System.out.println(luckyNumbers(arr));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> newList = new ArrayList<>(1);

        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            int minNum = 9999999;

            for (int j = 0; j <matrix[i].length ; j++) {

                if (matrix[i][j] < minNum) {
                    minNum = matrix[i][j];
                    minIndex = j;

                }
            }
            boolean check = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[i][minIndex] < matrix[k][minIndex]) {
                    check = false;
                    break;

                }


            }

            if (check) {
                newList.add(matrix[i][minIndex]);

            }





        }
        return newList;
    }
}






