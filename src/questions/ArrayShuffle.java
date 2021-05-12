package questions;

import java.util.Arrays;

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 */
public class ArrayShuffle {
    public static void main(String[] args) {
        int nums[]={2,5,1,3,4,7};
        int n=3;
        System.out.println(Arrays.toString(solver(nums,n)));
    }
    public static int[] solver(int nums[],int n){
        int res[]= new int[2*n];
        for (int i = 0; i <2*n; i++) {
            if (i%2==0)
                res[i]=nums[i/2];
            else
                res[i]=nums[n+i/2];
        }
        return res;
    }
}
