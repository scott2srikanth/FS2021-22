package questions.strings;
/*
Given a String, the task is to remove the special characters from the string.

input=
a$b%c@d!
output=
abcd

input=
a*b+1-304
output=
ab1304

 */
/*
case=1
input=
a$b%c@d!
output=
abcd

case=2
input=
a$B%c@d!
output=
aBcd

case=3
input=
a*b+1-304
output=
ab1304

case=4
input=
a*b+1-30 4
output=
ab1304

 */
public class String_RemoveSpecialChar {
    public static void main(String[] args) {
        String str="a$B%c@d! 4";
        System.out.println(str.replaceAll("[^\\w\\d]+",""));
    }
}
