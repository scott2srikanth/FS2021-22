package chapter4.set;

import java.util.*;

/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 */
public class NumbersDisappearedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] values = new int[num];
        for (int i = 0; i <num ; i++) {
            values[i]=sc.nextInt();
        }

        System.out.println(findDisappearedNumbers(values));
    }
        public static List<Integer> findDisappearedNumbers(int... nums) {
            Set<Integer> set = new HashSet<>();
            for(int i : nums){
                set.add(i);
            }
            ArrayList<Integer> al = new ArrayList<>();
            for(int j = 1;j<=nums.length ;j++){
                if(!set.contains(j))al.add(j);
            }
            return al;
        }

        public void fly(int numMiles) { }
        public int fly(Integer numMiles) { return  1;}

}
