package Z_JavaPractice;

public class Recursion {
    public static void printNum(int n){
        System.out.println(n);
        if (n==0){
            return;


        }
        printNum(n-1);
    }

//    FACTORIAL OF NUMBERS
    public static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * printFactorial(n-1);
    }


//    FIBONACCI SERIES
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }



    public static void main(String[] args) {
//        print number from 1 to n
//        printNum(5);

//        System.out.println(printFactorial(5));
        System.out.println("fibonacchi of 5 is :" +fibonacci(7));






    }
}
