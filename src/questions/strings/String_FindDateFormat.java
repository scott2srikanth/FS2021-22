package questions.strings;
/*
Given a date in form of String, the task is to find out the date is in the dd/mm/yyyy format or not.

input=
17/12/2020
output=
Yes

input=
16-12-2010
output=
No

input=
12/31/2000
output=
No
 */
/*
case=1
input=
17/12/2020
output=
Yes

case=2
input=
16-12-2010
output=
No

case=3
input=
12/31/2000
output=
No

case=4
input=
32/11/2021
output=
No

 */
public class String_FindDateFormat {
    public static void main(String[] args) {
        String str="31-11-2021";
        System.out.println((str.matches("(0?[1-9]|[12]\\d|30|31)/(0?[1-9]|1[0-2])/(\\d{4})"))?"Yes":"No");
    }
}
