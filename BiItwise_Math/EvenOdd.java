package BiItwise_Math;

public class EvenOdd {
    public static void main(String[] args) {
        int num = 67;
        boolean ans = Evenodd(num);
        if (ans){
            System.out.println("The number is odd");
        }else {
            System.out.println("Even");
        }

    }


    public static boolean Evenodd(int num){

       return (num & 1) ==1;
    }
}
