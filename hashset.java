import java.util.*;
public class hashset {
    public static void main(String args[])
    {
        Scanner   sc=new Scanner(System.in);
        HashSet<String> a=new HashSet<>();
        //accepting the values into hashset
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            a.add(s);
        }
        System.out.println(a);
        }
    }

    

