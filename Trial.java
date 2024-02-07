import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trial {

    public static void main(String[] args) {
       int [] nums ={3,1,3,4,2};
        System.out.println(findDisappearedNumbers(nums));




    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i =0;
        while(i<n){

            int correct = nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }

       List<Integer> ans = new ArrayList<>();
        for (int j =0;j<nums.length; j++){
//            if(j != nums[j]-1){
                ans.add(nums[j]);
//            }

        }

        return ans;





    }
    public static void swap(int []arr,int start,int second){
        int temp = arr[start];
        arr[start] = arr[second];
        arr[second] = temp;


    }

}
