package Recursion;

public class subSet {

    public static void main(String[] args) {
        String name ="abc";
        subSeq("",name);

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
}
