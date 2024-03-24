package Recursion;
class Solution {
    public static void reverse(char[]a,int s,int e){

        if (s>=e){
            return;
        }
        char temp = a[s];
        a[s]=a[e];
        a[e]=temp;

        reverse(a,s+1,e-1);




    }

    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o' };
        reverseString(ch);


    }

    public static void reverseString(char[] s) {


        int start = 0;
        int end = s.length - 1;

        reverse(s, start, end);

        System.out.println(s);


    }




}
