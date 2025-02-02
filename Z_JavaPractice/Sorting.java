package Z_JavaPractice;

public class Sorting {
    public static void main(String[] args) {
//        bubble Sort

        int arr[]= {7,8,3,1,2,3};

//        for (int i = 0; i < arr.length-1 ; i++) {
//            for (int j = 0; j < arr.length-i-1 ; j++) {
//                if(arr[j]>arr[j+1]){
////                    swap by bits
////                    arr[j] = arr[j]^arr[j+1];
////                    arr[j+1]=arr[j]^arr[j+1];
////                    arr[j]= arr[j]^arr[j+1];
//
////                    or  we can use normal swap
//
//                    int temp = arr[j];
//                    arr[j] =arr[j+1];
//                    arr[j+1] = temp;
//
//                }
//
//            }
//
//        }
//
//        for (int num: arr ) {
//            System.out.print(num + " ");
//
//
//        }



//        SELECTION SORT

//        for (int i = 0; i <arr.length-1 ; i++) {
//            int smallest = i;
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//
//            }
////            swap smallest
//            int temp = arr[smallest];
//            arr[smallest]=arr[i];
//            arr[i]=temp;
//
//
//        }





//        INSERTION SORT
        for (int i = 1; i <arr.length; i++) {
            int current = arr[i];
            int j =i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
//            placement
            arr[j+1]=current;

        }

        for(int num:arr){
            System.out.print(num+" ");
        }









    }
}
