package arrayQues;

public class FindNumberWithEvenNoOFDigits {
    public static void main (String [ ]args){

    int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));



}
    public static int findNumbers(int[] nums) {
    int even =0;

    for(int i = 0 ; i<nums.length; i++){
        int temp= nums[i];
        int count=0;

        while(temp>0){
           temp = temp/10;
           count++;

        }
        if (count %2 ==0){
            even ++;

        }
    }
    return even;





};
}