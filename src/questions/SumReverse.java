package questions;

/*
Amith needs to check sum of two numbers in a special way.
The numbers themselves will be big enough plus the sum needs to be done in a reversed way.
For example, if two numbers were 24 and 13, we have to first reverse these numbers to make them 42 and 31 and then we have to do the addition so the sum will be 42 + 31 = 73.
Afterwards he needs to output the result as reversed again, so the output will be 37 actually.
One advantage he has is that the input numbers will never have leading zero.
But the resulted sum if has any leading zeroes need to be removed.

For example,
if we have two numbers such as 911 and 199, then the reversed numbers will be 119 and 991 and the sum will be 119 + 991 = 1110.
So, if we reverse, the output should be 0111, but actually we have to consider 111 as output because we should remove all leading zeroes in final output.
As it is hard for Amith, so he wants to hire a freelancer who can write a small program to help him.

Sample:
input=
199
911
output=
111

input=19
22
output=311
*/
/*
case=1
input=
199
911
output=
111

case=2
input=19
22
output=311

case=3
input=129
125
output=2441
 */

import java.util.Scanner;

public class SumReverse {
    public void solution(){
        Scanner input = new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();

        int num1Reverse=reverse(num1);
        int num2Reverse=reverse(num2);

        int sum=num1Reverse+num2Reverse;
        int sumReverse =reverse(sum);
        System.out.print(sumReverse);
    }

    public int reverse(int num){
        int reverseNum=0;
        while(num!=0){
            int d=num%10;
            reverseNum=reverseNum*10+d;
            num=num/10;
        }
        return reverseNum;
    }

    /*
    public static int sb (String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int x=sb(s1)+sb(s2);
        StringBuilder sx = new StringBuilder(String.valueOf(x));
        sx.reverse();
        System.out.println(sx);
    }
     */

}
