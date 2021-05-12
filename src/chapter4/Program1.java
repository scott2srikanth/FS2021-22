package chapter4;

import java.math.BigInteger;

public class Program1 {
    public static void main( String[] args ) {

        long sum4 = sumNumber(1, 3, 5, 7,4,5,7,8,9,2,3,5,6,7,8,12,345,555,6);
        System.out.println("sum4 = " + sum4);
    }
    public static long sumNumber(int ... args){
        long sum=1;
        for(int x: args){
            sum *= x;
        }
        return sum;
    }
}
