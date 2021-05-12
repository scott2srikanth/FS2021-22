package questions.controlflow;

import java.util.Scanner;

/*Write a Java program to print following pattern

input=5
output=
    1
   123
  12345
 1234567
123456789
*/
/*
case=1
input=5
output=
    1
   123
  12345
 1234567
123456789
case=2
input=3
output=
  1
 123
12345
 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pattern(N);
    }

    public static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                if (k <= i) {
                    System.out.print(k);
                }
            }
            for (int l = 2; l <= 2 * n; l++) {
                if (l <= i) {
                    System.out.print(l + i - 1);
                }
            }
            System.out.println();
        }
    }
}
