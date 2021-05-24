package datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
Given an integer K and a queue of integers, write code to reverse the order of the first K elements of the queue.
Input:
Q=[10,20,30,40,50]
K=3
Output:
Q = [30, 20, 10, 40, 50]
Note : use Deque data structure

 */
public class ReverseKqueue {
    public static void main(String[] args) {
        int arr[]={70,20,130,40,50};
        int k = 4;

        Deque<Integer> dq = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < arr.length; i++)
            dq.add(arr[i]);
        dq.forEach(a->System.out.print(a+" "));

        for(int i=0;i<k;i++)
            q.add(dq.remove());

        for(int i=0;!q.isEmpty();i++)
            dq.offerFirst(q.remove());
        System.out.println();

        dq.forEach(a->System.out.print(a+" "));
    }

}
