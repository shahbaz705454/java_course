package Basics;

import java.util.ArrayList;
import java.util.Scanner;
public class _15_ArrayList {
    public static void main(String[] args) {
//        Syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(243);
        list.add(24);
        list.add(4);
        list.add(7);
        list.add(75);
        list.add(58);
        list.remove(0);
        System.out.println(list);

//        SOME FUNCTION OF ARRAY LIST

        list.remove(1);
        System.out.println(list);
        list.set(0,22);
        System.out.println(list);










    }
}
