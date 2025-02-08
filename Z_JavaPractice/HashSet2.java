package Z_JavaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<Integer>  list  = new HashSet<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(7);

        Iterator<Integer> it = list.iterator();

       while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("hello");

    }
}
