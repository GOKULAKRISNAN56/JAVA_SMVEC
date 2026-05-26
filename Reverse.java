import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        System.out.println(rev);
    }
}
