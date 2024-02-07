package arrayQues;

import static java.lang.Math.max;

class Angle {

    public static void main(String[] args) {
        int [] input = {2,3,1,1,4};
        System.out.println(canJump(input));


    }

        public static boolean canJump(int[] nums) {
            // boolean ans = false;


            int dest = 0;

            for(int i =0;i<nums.length;i++){
                if(i>dest){
                    return false;
                }else{
                    dest = Math.max(dest,i+nums[i]);

                }


            }
            return true;
        }

        }







