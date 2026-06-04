import java.util.*;

public class SetTask {
    public static void main(String[] args) {
        // Find Repeated characters

        String n = "Banana";
        n.toLowerCase();
        Set<Character> s =new HashSet<>();
        Set<Character> p =new HashSet<>();

        for(int i=0;i<n.length();i++)
        {
            char ch = n.charAt(i);
            if(!s.add(ch)&&p.add(ch))
            {
                System.out.println(ch+" ");
            }
        }













        // print common elements
        // Set<Integer> s =new HashSet<>();
        // int [] a = {1,2,3,4,5};
        // int [] b = {3,4,5,6,7};
        // for(int i=0;i<a.length;i++)
        // {
        //     s.add(a[i]);
        // }
        // for(int i=0;i<b.length;i++)
        // {
        //     if(s.contains(b[i]))
        //     {
        //         System.out.println(b[i]+" ");
        //     }
        // }
            
    }
}
