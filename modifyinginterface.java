import java.util.*;
public class modifyinginterface {
    public static void main(String args[])
    {
    HashMap<String,String> a=new HashMap<>();
    a.put("sno","01");
    a.put("sname","vinay");
    a.put("city","chennai");
    System.out.println(a);
    //modifying value for a key
    a.put("sno","90");
    System.out.println(a);
    //removing key in a hashmap
    a.remove("sname");
    System.out.println(a);
    a.clear();
    System.out.println(a);
    }
}