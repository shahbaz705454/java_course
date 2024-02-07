package arrayQues;


public class MaximumSubArray {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));

    }

    public static int maxSubArray(int[] nums) {


        int Sum = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];

            if (temp > Sum) {
                Sum = temp;
            }

            if (temp < 0) {
                temp = 0;
            }
        }

        return Sum;


    }
}


