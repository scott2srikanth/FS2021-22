package questions.arrays;

public class Array_SumOfElements {
    public static void main(String[] args)
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        for(int x:A)
        {
            sum=sum+x;
        }
        System.out.println("Sum is "+sum);
    }
}
