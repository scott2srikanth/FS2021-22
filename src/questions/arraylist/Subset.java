package questions.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given a chapter4.set of distinct integers, S, return all possible subsets.

Note: 1) Elements in a subset must be in non-descending order.
      2) The solution chapter4.set must not contain duplicate subsets.

For example, given
For example, given
input= [1,2,3]
output=[[1], [1, 2], [2], [1, 3], [1, 2, 3], [2, 3], [3], []]
*/
/*
case=1
input=3
1
2
3
output=[[1], [1, 2], [2], [1, 3], [1, 2, 3], [2, 3], [3], []]
 */

public class Subset {
    public static void main(String[] args) {
        int[] a={6,8,2,5};
        Arrays.sort(a);
        System.out.println(subsets(a));
    }

    public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        if(nums == null || nums.length == 0){
            return result;
        }
        int s = 0;
        for(int n:nums){
            s = result.size();
            for(int i = 0;i<s;i++){
                ArrayList<Integer> temp = new ArrayList<>(result.get(i));
                temp.add(n);
                result.add(temp);
            }
        }
        return result;
    }
}
