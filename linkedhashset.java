import java.util.*;
public class linkedhashset {
    public static void main(String args[])
    {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("hello");
        a.add("hello");
        a.add("students");
        a.add("vinay");
        a.add("students");
        System.out.println(a);
        a.remove("vinay");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
    
}
