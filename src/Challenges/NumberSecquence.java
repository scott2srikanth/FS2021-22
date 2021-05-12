package Challenges;

import java.util.Scanner;

public class NumberSecquence {
    public static void main(String[] _args) {
         /*
           Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
         */
        int[] number={-2, -1, 1, 2, 3, 6};
        solver(number);
    }
    public static void solver(int[] number) {
        int split=number.length/2;//3
        boolean flag=true;
        for (int i = 0; i < split-1; i++) {
            if (number[i] >= number[i+1]) {
                flag=false;
                break;
            }
        }
        for (int i = split; i < number.length-1; i++) {
            if (number[i] >= number[i+1]) {
                flag=false;
                break;
            }
        }

        if (flag) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
