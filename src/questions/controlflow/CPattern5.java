package questions.controlflow;
/*

         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *

 */
public class CPattern5 {
    public static void main(String[] args) {
        int k=0;
        for (int i = 1; i <= 5; ++i, k = 0) {
            for (int space = 1; space <= 5 - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
