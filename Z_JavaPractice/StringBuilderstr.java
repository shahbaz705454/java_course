package Z_JavaPractice;
import java.util.*;


public class StringBuilderstr {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Mohd Shahbaz");
        System.out.println(str1);

//        Char at index
        System.out.println(str1.charAt(3));

//        Set character
       str1.setCharAt(0,'Z');
        System.out.println(str1);


        StringBuilder str2 = new StringBuilder("H");
        str2.append("e");
        str2.append("l");
        str2.append("l");
        str2.append("o");
        System.out.println(str2);

        System.out.println(str2.reverse());
    }
}
