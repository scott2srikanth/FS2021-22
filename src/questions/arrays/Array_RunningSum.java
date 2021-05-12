package questions.arrays;

import java.util.Arrays;

public class Array_RunningSum {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        for (int i =1; i < nums.length; i++){
            nums[i]= nums[i-1] + nums[i];
        }
        return nums;
    }
}
