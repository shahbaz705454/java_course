package BItwise_Math;

public class IsPrime {
    public static void main(String[] args) {

        int n  = 30;

        for (int i = 1; i <=n ; i++) {
            System.out.println(i + " " + isPrime(n));

        }


    }


     static boolean isPrime(int n) {

        if (n<=1){
            return false;
        }
        int c = 2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;

        }

        return true;
    }


}
