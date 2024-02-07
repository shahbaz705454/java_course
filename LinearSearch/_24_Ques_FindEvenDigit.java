package LinearSearch;

public class _24_Ques_FindEvenDigit {
    public static void main(String[] args) {
        int nums[] ={ 12,345,2,6,7896};
        int ans = FindNumber(nums);
//        System.out.println(ans);
        System.out.println(digit(-2463463));
    }

//    function to check whether the number is even or not

    static int FindNumber(int []arr){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(even(arr[i])){
                count++;
            }

        }
        return count;
    }

    static boolean even(int num){
        if (digit(num)%2==0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        if (num<0){
            num =num * -1;
        }
        int count = 0;
        while (num>0){
            num = num /10;
            count ++;
        }
        return count;
    }

}
