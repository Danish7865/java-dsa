//HashSet

import java.util.*;

public class Demo4
{
    public static void main(String[] args) 
    {
        HashSet hs=new HashSet();
        hs.add(10); //index based accessing not allow
        hs.add(20);
        hs.add(30);//hash table ko follow krke data add hota h
        hs.add(40);
        hs.add(40);//dublicate not allow
        System.out.println(hs);

        HashSet hs1=new HashSet();
        hs1.add("Danish");
        hs1.add("b");
        System.out.println(hs1);

        LinkedHashSet hs2=new LinkedHashSet();
        hs2.add(100); 
        hs2.add(20);
        hs2.add(30);
        hs2.add(40);
        System.out.println(hs2);
    }
}