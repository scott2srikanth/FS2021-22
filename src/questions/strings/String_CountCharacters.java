package questions.strings;
/* Write a program in Java to count total number of alphabets,
digits and special characters in a string.

Test Data :
Input the string :welcome to k_m.i_t college1

Expected Output :
Alphabets : 20
Digits  : 1
Special characters : 6

*/
/*
case=1
input=welcome to k_m.i_t college1
output=Alphabets : 20
Digits  : 1
Special characters : 6

case=2
input=Dream_Land is my home Land112
output=Alphabets : 21
Digits  : 3
Special characters : 5
 */
public class String_CountCharacters {
    public static void main(String[] args) {
        String s="welcome to k_m.i_t college1";
        char[] ch=s.toCharArray();
        int alphabets=0;
        int digits=0;
        int special=0;
        for (int i = 0; i <ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
                alphabets++;
            else if(ch[i]>='0' && ch[i]<='9')
                digits++;
            else
                special++;
        }
        System.out.println("Alphabets : "+alphabets);
        System.out.println("Digits : "+digits);
        System.out.println("Special characters : "+special);
    }
}
