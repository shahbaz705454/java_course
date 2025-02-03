package Z_JavaPractice;

public class Recursion_3 {

//   Count total path in a maze from (0,0) to (n,m)
    public static  int countPaths(int i,int j,int m, int n){
        if(i==n || j==m){
            return 0;

        }
        if (i== n-1 && j== m-1){
            return 1;

        }
//        move downward
        int downPaths = countPaths(i+1,j,m,n);

//        move rightward
        int rightPaths = countPaths(i,j+1,m,n);

        return downPaths+rightPaths;
    }


//    N Queen


    public static void main(String[] args) {
        int n=3;
        int m=4;
        System.out.println(countPaths(0,0,m,n));


    }
}
