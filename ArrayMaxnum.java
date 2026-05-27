import java.util.Scanner;

public class ArrayMaxnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        //input from the user
        for (int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int temp;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;i<=n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
             System.out.println(arr[i]);
        }
       
    }
}
