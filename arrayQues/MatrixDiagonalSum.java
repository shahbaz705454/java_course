package arrayQues;

public class MatrixDiagonalSum {

    public static void main (String []args) {

        int[][] mat = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        int k= mat.length-1;
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int k= mat.length-1;

        for(int i= 0 ; i<mat.length; i++){



            for (int j = 0;j<mat.length; j++){
                if (i==j){
                    sum = sum+mat[i][j];
                }
                if(i!=j && j == k ){
                    sum = sum + mat[i][j];



                }


            }
            k--;
        };
        return sum;

    };
}
