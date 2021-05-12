package questions.strings;
/*
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
/*
case=1
input=2
3
output=5

case=2
input=193
339
output=532

case=3
input=999
999
output=1998

case=4
input=9999999999999
1111111111111
output=11111111111110
 */
public class StringAdd {
    public static void main(String[] args) {
        System.out.println(addStrings("9999999999999","1111111111111"));
    }
    public static String addStrings(String num1, String num2) {
        int len1=num1.length()-1;
        int len2=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(len1>=0 || len2>=0){
            int a= len1<0?0:num1.charAt(len1)-'0';
            int b= len2<0?0:num2.charAt(len2)-'0';
            int sum = a+b+carry;
            int num = sum%10;
            carry = sum/10;
            sb.append(num);
            len1--;
            len2--;
        }

        if(carry ==1){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
