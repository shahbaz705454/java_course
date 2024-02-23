package BiItwise_Math;

public class SetBit {
    public static void main(String[] args) {
        int n = 45;


        System.out.println(setBit(n));
        System.out.println(Integer.toBinaryString(n));

    }

    private static int setBit(int n) {

        int count =0;
        while(n>0) {
            count++;

         n =n & (n-1);

        }


        return count;

    }
}
