package questions.arrays;
/*

Write a java program to multiply two matrices.

3 5 9
7 6 2
4 3 5

1 5 2
6 8 4
3 9 7

output
4 10 11
13 14 6
7 12 12

e.g
input=
3    //Total size of the 1st array/rows
3    //Size of array row
3 5 9    //Element for 1st row
7 6 2    //Element for 2nd row
4 3 5    //Element for 3rd row
3    //Total size of the 2st array/rows
3    //Size of array row
1 5 2    //Element for 1st row
6 8 4    //Element for 2nd row
3 9 7    //Element for 3rd row

output=
3 5 9
7 6 2
4 3 5

*/
/*
case=1
input=
3
3
3 5 9
7 6 2
4 3 5
3
3
1 5 2
6 8 4
3 9 7

output=
3 5 9
7 6 2
4 3 5
 */
public class Array_MatricsMultiplication {
    public static void main(String[] args)
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        //int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};

        int C[][]=new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }

        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
