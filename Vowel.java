import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter the alphabet: ");
        Scanner Sc=new Scanner(System.in);
        String alpha=Sc.nextLine();
        if(alpha=="a")
        {
            System.out.println("vowel");
        }
        else if(alpha=="y")
        {
            System.out.println("Consonant");
        }

    }
}
