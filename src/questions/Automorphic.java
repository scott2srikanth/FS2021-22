package questions;

import java.util.Scanner;

/* Write a Java Program to check whether the entered number is Automorphic Number or not.

Description- A number is called Automorphic if and only if its square ends
in the same digits as the number itself.

Sample 1:
input=5
output=Yes

Sample 2:
input=14
output=No
*/
/*
case=1
input=6
output=Yes

case=2
input=76
output=Yes

case=3
input=14
output=No

case=4
input=376
output=Yes
 */
public class Automorphic {
    public static void main(String[] args) {
        int num=5;
        System.out.println(isAutomorphic1(num));

        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int c=0, sqr = num*num;
        int temp =num;

        while(temp>0){
            c++;
            temp=temp/10;
        }

        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));

        if(num == lastSquareDigits)
            System.out.println("Yes");
        else
            System.out.println("No");

         */
    }

    static boolean isAutomorphic1(int number)
    {
        return ("" + number * number).endsWith(""+number);
    }

    public static String isAutomorphic(int num){
        int digits=countDigits(num);
        int sqr=square(num);
        //int lastSquareDigits = (int)(sqr%(Math.pow(10,digits)));
        return num==lastDigitsOfSquaredNumber(sqr,digits)?"Yes":"No";
    }

    public static int lastDigitsOfSquaredNumber(int num, int digit){
        return (int)(num%(Math.pow(10,digit)));
        /*int lastSquareDigits=0;
        for(int i=1;i<=digit;i++){
            int temp = num%10;
            lastSquareDigits = lastSquareDigits*10+temp;
            num=num/10;
        }
        return reverse(lastSquareDigits);*/
    }

    public static int reverse(int num){
        int reverseNum=0;
        while(num!=0){
            int d=num%10;
            reverseNum=reverseNum*10+d;
            num=num/10;
        }
        return reverseNum;
    }

    public static int square(int number){
        return number*number;
    }

    public static int countDigits(int number){
        int count = 0;
        for (; number != 0; number /= 10, ++count);
        return count;
    }
}
