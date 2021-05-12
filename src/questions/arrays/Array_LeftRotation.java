package questions.arrays;

public class Array_LeftRotation {
    public static void main(String[] args)
    {
        int arr[]={6,2,9,8};
        int n=2;
        int x;
        for(int i=0;i<n;i++)
        {
            x=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[0];
            }
            arr[0]=x;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
