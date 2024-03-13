class Solution {


    public static void main(String[] args) {
       char [] let = {1,3,5,6};
       char tar = 2;
        System.out.println(nextGreatestLetter(let,tar));



    }
    public static int nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length-1;
        int mid = 0;

        while(start<=end){

            mid = start +(end-start)/2;

            if(letters[mid]==target){
                return mid;
            }
            if(letters[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }


        }
        if (target == 0){
            return 1;
        }else {

            return mid+1;
        }




    }
}