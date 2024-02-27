package Recursion;

public class NoofZeroes {
    public static void main(String[] args) {
        int n = 100405000;


        System.out.println(zeroes(n));
    }

    private static int zeroes(int n) {
        return helper(n,0);
    }

    private static int helper(int n,int count) {

        if (n==0){
            return count;
        }

        int rem = n%10;
        if (rem==0){
            return helper(n/10,count+1);
        }else{
            return helper(n/10,count);
        }
    }
}
