package Recursion;

public class Permutation {
    public static void main(String[] args) {
        permutaion("","abc");

    }

    public static void permutaion(String p,String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutaion(f+ch+s,up.substring(1));


        }

    }
}
