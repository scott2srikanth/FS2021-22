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
2    //Index to insert
20   //Value to be inserted
output=
6 2 9 8    //original Array
6 2 20 9 8 //After insertion

*/
/*
case=1
input=
4
6
2
9
8
2
20
output=
6 2 9 8
6 2 20 9 8
 */
public class Array_CopyAndInsertArray {
    public static void main(String[] args)
    {
        int A[]={8,6,10,9,2};

        System.out.println("Length of A="+A.length);

        int B[]=new int[10];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;

        System.out.println("Length of A="+A.length);

    }
}
