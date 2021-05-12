package chapter4.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

https://yyc-images.oss-cn-beijing.aliyuncs.com/find_error_nums_using_set.png
 */
/*
Example 1:

Input:
1
2
2
4
Output: [2,3]

Example 2:

Input: nums = [1,1]
Output: [1,2]
 */
public class SetMismatch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(2,4,1,2)));
    }
    public static int[] findErrorNums(int... nums) {
        Set<Integer> set = new HashSet<>();
        int duplicate = 0, n = nums.length;
        long sum = (n * (n+1)) / 2;
        for(int i : nums) {
            if(set.contains(i))
                duplicate = i;
            sum -= i;
            set.add(i);
        }
        return new int[] {duplicate, (int)sum + duplicate};
    }
}
