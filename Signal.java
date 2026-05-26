import java.util.Scanner;

public class Signal {
    public static void main(String[] args) {
        System.out.println("Select the follow option you want: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s) 
        {
            case "Red":
                System.out.println("Stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            case "Yellow":
                System.out.println("Ready");
                break;
            default:
                System.out.println("not exist");
                break;
        }
    }
}
