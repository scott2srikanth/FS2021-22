package Challenges;

import java.util.Scanner;

public class SayChallenge {
    public static void main(String[] _args) {
        int x,n;
        Scanner num = new Scanner(System.in);
        n = num.nextInt();
        solver(n);
    }

    public static void solver(int num){
        if(num>0) {
            System.out.print("S");
            for (int x = 1; x <= num; x++)
                System.out.print("a");
            System.out.print("y");
        }
        else
            System.out.print("Say");
    }
}
