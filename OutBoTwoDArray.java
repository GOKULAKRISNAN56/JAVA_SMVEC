import java.util.Scanner;

public class OutBoTwoDArray {
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
        for(int i=0;i<=r-1;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(arr[i][j]);
            }
            
        }
    }
}