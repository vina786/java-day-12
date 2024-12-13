// accepting values into a linked list
import java.util.*;
public class acceptingvalues {
    public static void main(String args[])
    {
        //accepting values into a linked list
        LinkedList<Integer> a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            int s=sc.nextInt();
            a.addFirst(s);
        }
        for(int i=0;i<size;i++)
        System.out.println(a.get(i)+" ");
        }
    }
    
