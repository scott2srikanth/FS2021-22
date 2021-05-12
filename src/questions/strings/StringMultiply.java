package questions.strings;
/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class StringMultiply {
    public static void main(String[] args) {
        System.out.println(multiply("123","111"));
    }

    public static String multiply(String a, String b) {
        String num1=new StringBuilder(a).reverse().toString();
        String num2=new StringBuilder(b).reverse().toString();


        int len1=num1.length();
        int len2=num2.length();
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[len1+len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                arr[i+j] +=(num1.charAt(i)-'0') * (num2.charAt(j)-'0');
            }
        }

        for (int i = 0; i <arr.length; i++) {
            int num=arr[i]%10;
            int carry = arr[i]/10;
            if(i+1<arr.length){
                arr[i+1] += carry;
            }
            sb.append(num);
        }

        sb.reverse();
        while (sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);
        return sb.toString();

        /*if(num1.equals("0")||num2.equals("0"))
            return "0";
        int len1=num1.length();
        int len2=num2.length();

        int[][]xxs=new int[len2][len1+len2];
        int more=0;

        for(int i=len2-1;i>=0;i--){
            for(int j=len1-1;j>=0;j--){
                int m=num1.charAt(j)-'0';
                int n=num2.charAt(i)-'0';
                int sum=n*m;
                sum+=more;
                xxs[len2-i-1][j+i+1]=sum%10;
                more=sum/10;
            }
            xxs[len2-i-1][i]=more;
            more=0;
        }

        String res="";

        for(int i=len2+len1-1;i>=0;i--){
            int temp=0;
            for(int j=0;j<len2;j++){
                temp+=xxs[j][i];
            }
            temp+=more;
            if(temp!=0||i!=0)res=(temp%10)+res;
            more=temp/10;
        }

        return res;

         */
    }
}
