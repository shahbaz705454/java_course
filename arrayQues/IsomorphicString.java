package arrayQues;

import java.util.*;

public class IsomorphicString {

    public static void main(String[] args) {


        String s = "foo";
        String t = "bar";

        System.out.println(isIsomorphic(s,t));





    }



        public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> isomorphic = new HashMap<>();




        for (int i = 0; i < s.length(); i++) {
            if (isomorphic.containsKey(s.charAt(i))) {
                if(t.charAt(i)!=isomorphic.get(s.charAt(i))){

                    return false;

                }


            } else {

                if(isomorphic.containsValue(t.charAt(i))){
                    return false;
                }

                isomorphic.put(s.charAt(i),t.charAt(i));


            }


        }
        return true;

    }





}
