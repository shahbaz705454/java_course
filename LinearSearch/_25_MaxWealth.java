package LinearSearch;

public class _25_MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));


    }


     static int maximumWealth(int[][] accounts) {
         int wealth = 0;



         for (int i = 0; i < accounts.length; i++) {
             int temp =0;

             for (int j = 0; j < accounts[i].length; j++) {


                 temp = temp + accounts[i][j];
                 if (wealth < temp) {
                     wealth = temp;
                 }


             }


         }
         return wealth;


     }
}
