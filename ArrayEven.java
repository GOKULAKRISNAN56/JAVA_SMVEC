import java.util.Scanner;

public class ArrayEven {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        //input form the user
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        //print
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                 sum+=arr[i]; 
            }
        }
        System.out.println("the odd number is: "+sum);
    }
}
