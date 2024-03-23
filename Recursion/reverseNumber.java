package Recursion;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(0,304050));

    }
    public static int reverse(int sum,int n){
        if(n%10==n){
            return n;
        }

        if (n%10==0){
            return reverse(sum+1,n/10);
        }else {
            return reverse(sum,n/10);
        }


    }
}
