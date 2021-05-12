package questions.arrays;
/*

Write a java program to search a element in an array.

e.g
input=
4    //Size of array
6    //Element 1
2    //Element 2
9    //Element 3
8    //Element 4
9    //Key to search
output=
Element Found at :2

*/
/*
case=1
input=
4
6
2
9
8
9
output=
Element Found at :2
 */
import java.util.Scanner;

public class Array_SearchElement {
    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter a Key " );
        int key=sc.nextInt();

        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
