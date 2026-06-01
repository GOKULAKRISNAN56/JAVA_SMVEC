import java.util.Arrays;


public class AnagramString {

    public static boolean IsAnagram(String s1,String s2){

        s1.toLowerCase();
        s2.toLowerCase();
        char[]c1=s1.toCharArray();
        char[]c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(c1.length!=c2.length)
        {
            return false;
        }
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]!=c2[i])
            {
                return false;
            }
        }     
        
        return true;
    }
    

    public static void main(String[] args) {
        System.out.println(IsAnagram("heart","earth"));
    
        
    }
}
