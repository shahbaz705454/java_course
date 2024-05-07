package arrayQues;

public class patterQues {
    public static void main(String[] args) {


                int n = 5;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= i; ++j) {
                // Calculate the numbers used so far by previous columns
                int x = 0;
                for (int v = 0; v < j; ++v) {
                    x = x + (n - v);
                }
                if ((j % 2) == 0) {
                    // even columns
                    System.out.print(x + i - j + 1 + " ");
                } else {
                    // odd columns
                    System.out.print(x + n - i + " ");
                }
            }
            System.out.println();
            System.out.println("hello");
        }
    }




}

