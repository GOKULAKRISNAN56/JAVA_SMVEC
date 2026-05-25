import java.util.Scanner;

class Test
{
    public static void main(String []args)
    {
        System.out.println("Enter the number: ");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else 
            {
                System.out.println(i);
            }
       
        }
        System.out.println("");
        


    }
}