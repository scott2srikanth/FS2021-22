package questions;

import java.util.Scanner;

/* Write a Java program to check whether the given non-negative number is SPYNUMBER or not.

A SPYNUMBER is a number where the sum of its digits equals the product of its digits.

Ex: 1124 is SPYNUMBER, because the sum of its digits(1+1+2+4) = 8 and
    the product of its digits (1*1*2*4) = 8 is equal.

If the number is SPYNUMBER print true else print false.

Sample :
input=1124
output=true

input=1113
output=false

input=-5
output=-1

*/
/*
case=1
input=123
output=true

case=2
input=1113
output=false

case=3
input=-5
output=-1

case=4
input=1124
output=true

case=5
input=1254
output=false

case=6
input=-85
output=-1
 */
public class SpyNumber {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int r,sum=0,pro=1;
        if(temp<0)
            System.out.println("-1");
        while(temp>0){
            r=temp%10;
            sum=sum+r;
            pro=pro*r;
            temp=temp/10;
        }

        if(sum==pro)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
