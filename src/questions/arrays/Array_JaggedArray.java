package questions.arrays;
/*

Write a java program to jagged array.

e.g
input=
3    //Total size of the array or rows
5    //Size of 1st array row
3    //Size of 2st array row
8    //Size of 3st array row
output=
0 0 0 0 0
0 0 0
0 0 0 0 0 0 0 0

*/
/*
case=1
input=
3
5
3
8
output=
0 0 0 0 0
0 0 0
0 0 0 0 0 0 0 0
 */
public class Array_JaggedArray {
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
