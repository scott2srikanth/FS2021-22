package questions.strings;
/*
Given a String, the task is to find out the given number is an hexa-decimal or not.

input=
FACE
output=
Yes

input=
FACES
output=
No
 */
/*
case=1
input=
FACE
output=
Yes

case=2
input=
FACES
output=
Yes

case=3
input=
5F
output=
Yes

case=3
input=

output=
No

 */
public class String_FindHexaDecimal {
    public static void main(String[] args) {
        String str="FACES";
        System.out.println((str.matches("[a-fA-F0-9]+"))?"Yes":"No");
    }
}
