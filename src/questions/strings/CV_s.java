package questions.strings;
/*

Write a java program to read a sentence as input and returns another string as output,
such that , a vowel in the input string will be de denoted by upper case letter ‘V’ and a
consonant in the input string will be denoted by upper case letter ‘C’. The output will contain
a word containing alternating sequence of ‘C’ and ‘V’. For example the word “kmit” sequence CVC.
It is not permissible to have two or more consecutive V or C in Sequence.

sample input =
Whereabouts
output =
CVCVCVC

sample input =
make in india
Output:
CVCVCVCV

*/

/*
case = 1
input =Whereabouts
output =CVCVCVC

case = 2
input =make in india
output =CVCVCVCV

case = 3
input =aeiou
output =V

case = 4
input =bcd
output =C

case = 5
input =liril
output =CVCVC
 */
public class CV_s {
    public static void main(String[] args) {
        String str="Whereabouts";

        char arr[]=new char[str.length()];
        char k=' ';
        for(int i=0;i<arr.length;i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                arr[i]='V';
            }
            else
            {
                arr[i]='C';
            }
        }
        //k=arr[0];
        //System.out.print(k);
        for(int i=0;i<arr.length;i++)
        {
            if(k!=arr[i])
            {
                k=arr[i];
                System.out.print(k);
            }

        }
    }
}
