package Recursion;

public class Reverse {
    static int sum=0;

    private static void reverse(int n) {
        if(n==0){
            return;
        }

        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }
    public static void main(String[] args) {
        reverse(236234);
        System.out.println(sum);
    }

}
