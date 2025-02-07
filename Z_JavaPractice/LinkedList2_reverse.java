package Z_JavaPractice;
import java.util.*;

public class LinkedList2_reverse {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("hello");
        list.add("This ");
        list.add("is");
        list.add("Shahbaz");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" -> ");

        }
        Collections.reverse(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" -> ");

        }




    }
}
