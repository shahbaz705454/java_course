package Recursion;

public class StepsToZero {


    public static void main(String[] args) {
        int n=41;
        System.out.println(Step(n));

    }

    private static int Step(int n) {

        return helper(n,0);
    }

    private static int helper(int n, int steps) {
    if (n==0){
        return steps;
    }
     if (n%2==0){
         return helper(n/2,steps+1);
     }else {
         return helper(n-1,steps+1);
     }

    }
}
