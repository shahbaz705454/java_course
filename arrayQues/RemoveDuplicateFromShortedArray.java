package arrayQues;

public class RemoveDuplicateFromShortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int rd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];

            }
        }
        return rd+1;
    }
        }



