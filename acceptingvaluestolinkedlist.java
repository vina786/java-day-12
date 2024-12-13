import java.util.*;
public class acceptingvaluestolinkedlist {
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("vinay");
        a.add("students");
        // iterator
        for(String s:a)
        {
            System.out.println(s+" ");
        }
    
}
}
