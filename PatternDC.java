import java.util.Scanner;

public class PatternDC {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            //space
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i*2-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
