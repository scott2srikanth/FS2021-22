package questions;

import java.util.Scanner;

/*Write a Java program to check whether a number is a Duck Number or not.

A Duck number is a number which has zeroes present in it,
but there should be no zero present in the beginning of the number.

Sample
input=3210
output=true

input=0234
output=false

input=1234
output=false

*/
/*
case=1
input=3210
output=true

case=2
input=0234
output=false

case=3
input=1234
output=false

case=4
input=000
output=false
 */
public class DuckNumber {

    public static void fun(int n){
        int q=n;
        int c=0;
        while(q!=0){
            int r=q%10;
            if(r==0)
                c++;
            q=q/10;
        }
        if(c>0)
            System.out.println(true);
        else
            System.out.println(false);
    }

    public static void duck(String str)
    {
        int n=str.length();
        int c=0;
        char ch;
        for(int i=1;i<n;i++)
        {
            ch=str.charAt(i);
            if(ch=='0')
                c++;
        }

        char q=str.charAt(0);
        if(c>0 && q!='0')
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        duck(str);
    }
}
