package Z_JavaPractice;

public class Recursion_2 {
    public static void towerOfHanoi(int n,String src,String helper,String dest){

        if (n==1){
            System.out.println(" Transferring Disk "+ n +" from " +src +" to " +dest);
            return;
        }

        towerOfHanoi(n-1,src,dest,helper);
        System.out.println(" Transferring Disk " + n +" from " +src +" to " +dest);
        towerOfHanoi(n-1,helper,src,dest);


    }


    public static void ReverseString(int idx,String s){
        if(idx==0){
            System.out.print(s.charAt(idx));
            return;

        }
        System.out.print(s.charAt(idx)+" ");
        ReverseString(idx-1,s);

    }

    public static void occurrenceOfElem(int first,int last,int idx,String s,char Elem){
        if(idx == s.length()-1){
            if (first>=0) {
                System.out.println("First Occurrence of Element At index : " + first);
                System.out.println("Last Occurrence of Element At index : " + last);
            }else{
                System.out.println("No Element Found");
            }
            return;
        }

        if(s.charAt(idx)==Elem){
            if (first>=0){
                last =idx;

            }else {
                first =idx;

            }

        }
        occurrenceOfElem(first,last,idx+1,s,Elem);
    }


    public static void isSorted(int idx,int arr[]){
        if(idx==arr.length-1){
            System.out.println("Array is sorted");
            return;
        }
        if (arr[idx] > arr[idx+1]){
            System.out.println("Array is Not Sorted");
            return;
        }
        isSorted(idx+1,arr);


    }

    public static void subsequence(int idx,String str,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
//        to be in the string
        subsequence(idx+1,str,newString+currChar);
//        to not be in the new String
        subsequence(idx+1,str,newString);
    }



//    KEYPAD Combination
    public static String[] keyPad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static  void combination (String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar-'0'];
        for (int i=0;i<mapping.length();i++){
            combination(str,idx+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {

//        tower Of Hanoi ->Time Complexity ->O(n^2)
        int n=3;
//        towerOfHanoi(n,"S","H","D");

//        Reverse a String  ->Time Complexity ->O(n)

        String name= "Mohd Shahbaz Is a Software Developer ";

//        ReverseString(name.length()-1,name);




//        First And Last occurrence of Element

        String name2 ="absdadsdsadasdasdsnasad";
        char elem = 'b';

//        occurrenceOfElem(-1,-1,0,name2,elem);

//        Array is sorted or NOT
        int arr[]={1,2,3,4,5,6,1};
        isSorted(0,arr);




//        SUBSEQUENCE OF STRING

        String str ="shahbaz";
        subsequence(0,str,"");


//        keypad Print Subsequence
        String str2="23";
        combination(str2,0,"");



    }
}
