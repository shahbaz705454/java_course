package Recursion;

import java.util.ArrayList;

public class subSet {

    public static void main(String[] args) {
        String name ="abc";
//        subSeq("",name);





    }
    public static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));

    }

    static ArrayList<String> subSeqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReturn(p+ch,up.substring(1));
        ArrayList<String> right = subSeqReturn(p,up.substring(1));

        left.addAll(right);
        return left;

    }
}
