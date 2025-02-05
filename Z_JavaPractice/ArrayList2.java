package Z_JavaPractice;
import java.util.ArrayList;

import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

//        Adding element in list
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(3);

        System.out.println(list);

//        get
        System.out.println(list.get(2));

//        update
        list.set(0,9);
        System.out.println(list);

//        remove

        list.remove(3);

//        Sorting
        Collections.sort(list);
        System.out.println(list);





    }
}
