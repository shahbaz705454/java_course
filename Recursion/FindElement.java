package Recursion;

public class FindElement {
    public static void main(String[] args) {
        int []arr ={ 1,2,5,7,3,5,8,3};
        int target = 2;

        System.out.println(find(arr,target,0));
    }

    private static int find(int[] arr, int target,int index) {
    if(index==arr.length-1){
        return -1;
    }
    if (arr[index]==target){
        return index;
    } else{
        return find(arr,target,index+1);
    }
    }
}
