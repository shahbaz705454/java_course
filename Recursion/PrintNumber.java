package Recursion;

public class PrintNumber {
    public static void main(String[] args) {

        int n = 5;
        print2(n);

    }
    static void print2(int n){

        if(n==0){
            System.out.println("0");
            return;
        }

        System.out.println(n);
        print2(n-1);
        System.out.println(n);


    }
}
