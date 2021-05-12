package questions.controlflow;

import java.util.Scanner;

/*Write a Java program to print following pattern

input=5
output=
10101
01010
10101
01010
10101

*/
/*
case=1
input=5
output=
10101
01010
10101
01010
10101

case=2
input=3
output=
101
010
101
 */
public class Pattern2 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i%2!=0 && j%2!=0)||(i%2==0 && j%2==0))
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.print("\n");
        }
    }
}
