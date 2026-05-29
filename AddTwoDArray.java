import java.util.Scanner;

public class AddTwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ente the number of rows: ");
        int r=in.nextInt();
        System.out.println("Ente the number of Columns: ");
        int c=in.nextInt();
        System.err.println("Enter the value of matrix: ");
        int [][]arr = new int [r][c];
        for (int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Martrix:");
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
                sum+=arr[j][i];
            }
            System.out.println(sum+" ");
        }
        // System.out.println("Matrix: ");
        //  for (int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //    System.out.println();
        // }
        in.close();
    }
}
