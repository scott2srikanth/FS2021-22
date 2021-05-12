package questions.controlflow;

import java.util.Scanner;

/*Write a Java program to print following pattern

input=5
output=
*********
 *******
  *****
   ***
    *
*/
/*
case=1
input=5
output=
*********
 *******
  *****
   ***
    *
case=2
input=3
output=
*****
 ***
  *
 */
public class Pattern9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pattern(N);
    }

    public static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * n; k++) {
                if (k <= (2 * n) - ((2 * i) - 1)) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
