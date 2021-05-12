package Challenges;

import java.util.Scanner;

/*
/* Write a java program with the following Scenario

Suppose that you add all of the page numbers in a book. If the total is 21,
the book could only have 6 pages because 1 + 2 + 3 + 4 + 5 + 6 = 21.
If I had said the total were 25, that would be impossible because the next number
in the series is 28 (21 + 7).

Create a function that, given the total number of pages as an argument,
returns true if it is a valid total and false if it is not.

Can you devise a solution that is more efficient than simply adding consecutive
integers as I did above?

Examples
input   output
5   --->false

4005   --->true

9453   --->true


*/
/*
case=1
input=28
output=true

case=2
input=9
output=false

case=3
input=4005
output=true

case=4
input=9454
output=false

case=5
input=9453
output=true
 */
public class PageNumber {

    public static boolean isPossible(int n) {
        for (int i = 0; i < n; i++) {
            if ((i * (i + 1) / 2) == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPossible(n) == true) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
