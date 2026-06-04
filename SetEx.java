import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        int [] arr={1,2,3,11,2,3};
        for(int i=0;i<arr.length;i++)
        {
            
           if(!s.add(arr[i])) // if(s.contains(arr[i]))
            {
                System.out.println(arr[i]);
            }
            s.add(arr[i]);
            
        }
        System.out.print("no .of unique :"+ s.size());



        // s.add(1);
        // s.add(2);
        // s.add(3);
        // s.add(1);
        // System.out.println(s);
        // System.out.println(s.size());
    }
}
