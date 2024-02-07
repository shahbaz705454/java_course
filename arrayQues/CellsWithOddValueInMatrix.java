package arrayQues;
class question {
    //https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/submissions/1149976656/

    public static void main(String[] args) {


        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1},
                {1, 1}};

        System.out.println(oddCells(m,n,indices));




    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            //row is constant


            for (int j = 0; j < n; j++) {

                ans[indices[i][0]][j]++;


            }

            // column constant

            for (int k = 0; k < m; k++) {
                ans[k][indices[i][1]]++;

            }


        }
        int count = 0;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }

        }

        return count;

    }


}
