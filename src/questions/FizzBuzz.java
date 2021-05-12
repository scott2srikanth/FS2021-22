package questions;

import java.util.Scanner;

/*Write a program that prints the numbers from 1 to n and for multiples of '3' print "Fizz"
instead of the number, for the multiples of '5' print "Buzz" and
for multiples of '15' print FizzBuzz.

Sample:
input:16
output=
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
*/
/*
case=1
input=16
output=1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16

case=2
input=36
output=1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
31
32
Fizz
34
Buzz
Fizz
 */
public class FizzBuzz {

    public void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%15!=0)
            {
                System.out.println("Fizz");
            }
            else if((i%5==0) && (i%15!=0))
            {
                System.out.println("Buzz");
            }
            else if(i%15==0)
            {
                System.out.println("FizzBuzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
