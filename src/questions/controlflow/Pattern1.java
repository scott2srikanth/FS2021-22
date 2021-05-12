package questions.controlflow;

import java.util.Scanner;

/*Write a Java program to print following pattern

input=5
output=
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
public class Pattern1 {
   /* public static void main(String[] args)
    {
        int n=8;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }*/
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
       int i,j;
       for(i=1;i<=num;i++)
       {
           for(j=1;j<=num;j++)
           {
               System.out.print(i+" ");
           }
           System.out.println();
       }
   }
}
