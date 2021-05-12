package questions.strings;
/*
Given an array of integers of size ‘n’.
Our aim is to calculate the maximum sum of ‘k’
consecutive elements in the array.

Input  : arr[] = {100, 200, 300, 400}
         k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}
         k = 4
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23}
of size 4.

Input  : arr[] = {2, 3}
         k = 3
Output : Invalid
There is no subarray of size 3 as size of whole
array is 2.


input=
4       //Size of array
100     //Element 1
200     //Element 2
300     //Element 3
400     //Element 4
2       //window k
output=700
 */
public class String_SlidingWindow {
    public static void main(String[] args) {
        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        int sum=0;
        int max=Integer.MIN_VALUE;

        if (arr.length < k) {
            System.out.println("Invalid");
        }
        for (int i = 0; i < k; i++)
            sum = sum + arr[i];

        for (int i = k; i < arr.length; i++) {
            System.out.println(arr[i]+":"+arr[i-k]);//23
            sum=sum + arr[i] - arr[i-k];
            max=Math.max(max,sum);
        }

        System.out.println(max);
    }
}
