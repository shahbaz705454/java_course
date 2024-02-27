package Recursion;

public class NumberofDigit {
    public static void main(String[] args) {

     int n = 1324;
        System.out.println(sumDigit(n));
        
    }

    private static int sumDigit(int n) {

        if (n==0){
            return 0;
        }

        return (n%10) + sumDigit(n/10);
    }
}
