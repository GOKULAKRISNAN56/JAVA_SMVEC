import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the value: ");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
