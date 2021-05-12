package questions.controlflow;
/*
Write a Java program to print following pattern

input=
output=
           1
         1   1
       1   2   1
     1   3   3    1
   1  4    6   4   1
 1  5   10   10  5   1


*/
public class Pattern5 {
    public static void main(String[] args) {
        int temp=0;
        for (int i = 0; i < 5; i++) {
            for (int space = 1; space <= 5 - i; space++)
                System.out.print("  ");
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    temp = 1;
                else
                    temp = temp * (i - j + 1) / j;
                System.out.printf("%4d", temp);
            }
            System.out.println();
        }
    }
}
