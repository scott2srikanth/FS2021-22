package datastructures.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
You are given a sequence of N integers of array A.
You need to partition the sequence, where the cost of making a partition from L to R is AL + AR.
Output the minimum and maximum total cost of making exactly K partitions where the total cost is the sum of costs of each partition.

Example
Input:
5 2
1 2 3 4 5

Output:
9 15

 */
public class CostMinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int K = 3;
        int N =arr.length;
        System.out.println(costMinMax(arr,N,K));
    }
    static String costMinMax(int[] arr, int n, int k) {
        PriorityQueue<Long> min = new PriorityQueue<>(new Comparator<Long>() {
            public int compare(Long l1, Long l2) {
                return Long.compare(l1, l2);
            }
        });

        PriorityQueue<Long> max = new PriorityQueue<>(new Comparator<Long>() {
            public int compare(Long l1, Long l2) {
                return Long.compare(l2, l1);
            }
        });

        for(int i=0; i<n-1; i++) {
            min.add((long)arr[i]+arr[i+1]);
            max.add((long)arr[i]+arr[i+1]);
        }

        long minCost = arr[0]+arr[n-1];
        long maxCost = arr[0]+arr[n-1];

        for(int i=0; i<k-1; i++) {
            minCost += min.poll();
            maxCost += max.poll();
        }
        return (minCost + " " + maxCost);
    }

}
