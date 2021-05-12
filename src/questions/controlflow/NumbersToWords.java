package questions.controlflow;

import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a Number");
        int n=scan.nextInt();

        int r;
        String str="";

        for(;n>0;n/=10){
            r=n%10;
            str=str+r;
        }

        System.out.println(str);

        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            float f = 2;
            switch(c)
            {
                case '0':System.out.print("Zero ");
                    break;
                case '1':System.out.print("One ");
                    break;
                case '2':System.out.print("Two ");
                    break;
                case '3':System.out.print("Three ");
                    break;
                case '4':System.out.print("Four ");
                    break;
                case '5':System.out.print("Five ");
                    break;
                case '6':System.out.print("Six ");
                    break;
                case '7':System.out.print("Seven ");
                    break;
                case '8':System.out.print("Eight ");
                    break;
                case '9':System.out.print("Nine ");
                    break;

            }

        }

    }
}
