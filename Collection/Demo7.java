import java.util.*;

public class Demo7 
{
    public static void main(String[] args) 
    {
        Hashtable ht=new Hashtable();
        ht.put(1, "Danish");
        ht.put(2,"Faiz");
        ht.put(3, "Atique");
        ht.put(4, "Shahid");
       // ht.put(null, null);// null not accepted
        System.out.println(ht);

        TreeMap tm=new TreeMap();//output receieved in ascending order
        tm.put(2, "Danish");
        tm.put(1,"Faiz");
        tm.put(3, "Atique");
        tm.put(4, "Shahid");
        System.out.println(tm);
    }
}
