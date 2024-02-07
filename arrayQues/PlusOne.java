package arrayQues;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int [] arr = {9,9};
        System.out.println(Arrays.toString(plusOne(arr)));

    }     public static int[] plusOne(int[] digits) {
            int n = digits.length;

            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i] += 1;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            // If we are here, it means there was a carry at the leftmost digit
            int[] newArr = new int[n + 1];
            newArr[0] = 1;

            return newArr;
        }
    }






