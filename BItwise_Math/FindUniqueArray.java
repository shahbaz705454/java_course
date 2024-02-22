package BItwise_Math;

public class FindUniqueArray {
    public static void main(String[] args) {
        int []arr ={2,3,4,4,6,3,2};
        System.out.println(ans(arr));

    }

    private static int ans(int[] arr) {
    int unique = 0;
    for (int n :arr){
        unique = unique^n;
    }

    return unique;
    }
}
