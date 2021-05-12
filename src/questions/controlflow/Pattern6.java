package questions.controlflow;
/*
Write a Java program to print following pattern

input=
output=
1
2 3
4 5 6
7 8 9 10

*/
public class Pattern6 {
    public static void main(String[] args) {
        int number=1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(number+" ");
                ++number;
            }
            System.out.println();
        }
    }
}
