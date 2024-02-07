package Strings;

public class StringBasic {
    public static void main(String[] args) {

//        String name1 ="Mohd";
//        System.out.println(name1);

//        name1 ="shahbaz";
//        System.out.println(name1);

//        String name2 = "shahbaz";

//        Comparison between Strings


//        System.out.println(name1 == name2);//   it compares the string if it is in the same memory pool,so it give true,
        // and it both name1 and name 2 referring the same object



        String a = new String("hello");
        String b = new String("hello");

//        System.out.println(a==b); // Here it give false because both are in different memory pools and both varible referring different object

//        System.out.println(a.equals(b)); //here it give true because it checks the value not reference

        System.out.println(a.charAt(2));
        System.out.println(a.toUpperCase());







    }
}
