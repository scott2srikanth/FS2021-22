package questions;

import java.util.Scanner;

/*Write a Program in Java to check whether given number is a Disarium Number or not.

Disarium Number: A number is called Disarium if sum of its digits powered with their
respective positions is equal to the number itself.

For example 135 is a DISARIUM
(Workings 1^1+3^2+5^3 = 135)

Sample :
Input= 135
Output= Yes

Input=80
Output=No
*/
/*
case=1
Input= 135
Output= Yes

case=2
Input=89
Output=Yes

case=3
Input=80
Output=No

case=4
Input=-128
Output=No
 */
public class Disarium {

    public static int countDigits(int number){
        int count = 0;
        for (; number != 0; number /= 10, ++count);
        return count;
    }
    public static int solver(int n)
    {
        int digits=countDigits(n);
        int res=0;
        while(digits!=0 && n!=0)
        {
            int rem=n%10;
            res=res+(int)Math.pow(rem,digits);
            digits--;
            n=n/10;
        }
        return res;

    }

    static boolean M(int n){
        int c=Integer.toString(n).length();
        int sum=0;
        int a=n;
        while(a!=0){
            int b=a%10;
            sum=(int)(sum + Math.pow(b,c--));
            a=a/10;
        }
        return (sum==n);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(solver(n) == n)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
