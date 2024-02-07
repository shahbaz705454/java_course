package LinearSearch;

import java.util.Scanner;

public class _18_Ques_String_LinearSearch {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        String name = "Mohammad shahbaz";
        char target = 'M';
        boolean ans = Search2(name, target);
        System.out.println(ans);


    }

//    static boolean Search(String name, char target) {
//        if (name.length() == 0) {
//            return false;
//        }
//        for (int i = 0; i < name.length(); i++) {
//            if (target == name.charAt(i)) {
//                return true;
//            }
//
//        }
//        return false;
//    }
//}

//    Using for each loop

    static boolean Search2(String name,char target) {
        if (name.length() == 0) {
            return false;
        }

        for (char c : name.toCharArray()) {
            if (c == target){
                return true;
            }


        }
        return false;
    }



}
