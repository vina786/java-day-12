import java.util.*;

public class mapinterface2 {
     public static void main(String args[])
    {
    HashMap<String,String> a=new HashMap<>();
    a.put("sno","01");
    a.put("sname","vinay");
    System.out.println(a);
    //printing hash map key value
    if(a.containsKey("sname"))
    {
        String d=a.get("sname");
        System.out.println(d);
    }
    }



}
