// finding frequency using for each
import java.util.*;
public class frequency {
    public static void main(String args[])
    {
        int arr[]={77,8,9,5,6,77,8,99,8};
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int a1:arr)
        {
            if(a.containsKey(a1))
            {
                a.put(a1,a.get(a1)+a1);
            }
            else{
                a.put(a1,1);
            }
        }
        System.out.println(a);
            }
            }
        