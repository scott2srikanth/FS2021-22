package questions.controlflow;

import java.util.Scanner;

/*Write a Java program to print following pattern

input=5
output=
1
10
101
1010
10101

*/
/*
case=1
input=5
output=
1
10
101
1010
10101

case=2
input=7
output=
1
10
101
1010
10101
101010
1010101
 */
public class Pattern3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++) {
                if (j % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
