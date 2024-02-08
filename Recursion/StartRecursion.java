package Recursion;

public class StartRecursion {

    public static void main(String[] args) {

        recur(1);

    }

    public static void recur(int n){
        System.out.println(n);

        if (n==10){
            return;
        }

        recur(n+1);
    }
}
