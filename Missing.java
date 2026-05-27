import java.util.*;

public class Missing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] arr={10,9,6,4,2,3,5,7,0,1};
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i)
            {
                System.out.println(i);
                break;
            }    
        }
    }
}
