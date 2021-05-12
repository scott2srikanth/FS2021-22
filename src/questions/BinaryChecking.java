package questions;
/*Write a java program to check whether the entered number is binary number or not

Sample 1:
input=111100
output=true

Sample 2 :
input=1120
output=false
*/
/*
case = 1
input = 1100
output = true

case = 2
input = -25
output = false

case = 3
input = 110011
output = true

case = 4
input = 121000
output = false
 */
public class BinaryChecking {
    public void solution(){
        int num=1001;
        String regex = "[01][01]+";
        System.out.println(String.valueOf(num).matches(regex));
    }

    /*
      Scanner sc= new Scanner(System.in);
        int inputNum= sc.nextInt();
        boolean flag=false;
        int originalNum=inputNum;
        while(inputNum>0){
            if((inputNum%10==0 || inputNum%10==1))
                flag=false;
            else{
                flag=true;
                break;
            }
            inputNum=inputNum/10;
        }
        if(flag==false && originalNum>0)
           System.out.println("true");
        else
           System.out.println("false");
}
     */
    /*
     Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0' || s.charAt(i)=='1')
            {
                count=count+1;
            }
        }
        if(count==s.length())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
     */
}
