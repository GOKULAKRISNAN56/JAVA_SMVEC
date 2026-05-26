import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter the digits: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0)
         {
            int rem=n%10;
            sum+=rem;
            n/=10; 
        }
        System.out.println(sum);
    }
}
