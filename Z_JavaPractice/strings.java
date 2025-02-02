package Z_JavaPractice;

public class strings {
    public static void main(String[] args) {

        String name1= "Mohd";
        String name2="Shahbaz";

//        concat String
        String name3 = name1.concat(name2);

//        upper Case
        String name4 = name3.toUpperCase();
        System.out.println(name3);
        System.out.println(name4);

//        compare String
        System.out.println(name4.compareTo(name4));


        for (int i = 0; i <name4.length() ; i++) {
            System.out.print(name4.charAt(i)+" ");

        }

// substring->

        System.out.println(name4.substring(3));

        StringBuilder strr = new StringBuilder("Shahbaz");



//

    }
}
