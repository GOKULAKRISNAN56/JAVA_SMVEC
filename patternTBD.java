import java.util.Scanner;

public class patternTBD {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            
            //star
            for(int j=1;j<=i*2-i;j++)
            {
                System.out.print("*");
            }
            //space
             for(int j=1;j<=n-i;j++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
   }
}
