package questions;

import java.util.Scanner;

/*
Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true  if a number is odd or false if it is even.

Sample Input
5
Sample Output
ODD
 */
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd()
    {
        PerformOperation po = a -> a%2 == 0 ? false : true;
        return po;
    }

}

public class LambdaExpression {
    public static void main(String[] args) {
        MyMath ob = new MyMath();
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        PerformOperation op;
        String ans = ob.checker(ob.isOdd(), num) ? "ODD" : "EVEN";
        System.out.println(ans);
    }
}
