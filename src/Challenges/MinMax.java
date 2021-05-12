package Challenges;
/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

 */
/*
case=1
input=
Enter number:
2
Enter number:
5
Enter number:
1
Enter number:
7
Enter number:
a
output=
min= 1, max= 7

case=2
input=
Enter number:
5
Enter number:
2
Enter number:
-6
Enter number:
9
Enter number:
a
output=
min= -6, max= 9

 */
import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;
        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min= "+ min + ", max= " + max);
        scanner.close();
    }
}

