package Recursion;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(0,456));

    }
    public static int reverse(int sum,int n){
        if(n%10==n){
            return n;
        }

        return sum+reverse(sum*10,n/10);


    }
}
