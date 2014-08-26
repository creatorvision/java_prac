// creatorvision
import java.util.*;
class reverse{
 
    public static String display(String s)
    {
        int l=s.length();
        char []c= new char[l];
        int i=0;
        while(l>0)
        {
            c[i]=s.charAt(l-1);
            l--;
            i++;
        }
        String res= String.copyValueOf(c);
        return res;
        
    }
 
}   
public class rev_client{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String inp =sc.nextLine();
        reverse r= new reverse();
        
        String ans=new String();
        ans=r.display(inp);
        System.out.println(ans);
    } 
}