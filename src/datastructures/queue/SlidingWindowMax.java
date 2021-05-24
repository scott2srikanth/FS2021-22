package datastructures.queue;
/*

You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
Example 3:

Input: nums = [1,-1], k = 1
Output: [1,-1]

Example 4:

Input: nums = [9,11], k = 2
Output: [11]
Example 5:

Input: nums = [4,-2], k = 2
Output: [4]

*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> de = new LinkedList();
        int arr[] = new int[nums.length-k+1];
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<k;++i){
            while(!de.isEmpty() && nums[i]>=nums[de.peekLast()]){
                de.removeLast();
            }
            de.addLast(i);
        }

        for(int i=k;i<nums.length;++i){
            list.add(nums[de.peek()]);
            while(!de.isEmpty() && de.peek()<=i-k){
                de.removeFirst();
            }
            while(!de.isEmpty() && nums[i]>=nums[de.peekLast()]){
                de.removeLast();
            }
            de.addLast(i);

        }
        list.add(nums[de.peek()]);
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr;
    }

}
