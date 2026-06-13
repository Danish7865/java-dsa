//TreeSet

import java.util.TreeSet;

public class Demo3 
{
    public static void main(String[] args) 
    {
        TreeSet ts=new TreeSet();
        ts.add(100);//data will be printing by shorted order and follow by Binary search tree
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);

        ts.add(100); //dublicate not allow
        //ts.add("pw");// string not allow
        System.out.println(ts);

        TreeSet hs1=new TreeSet();//allow
        hs1.add("Danish");
        hs1.add("b");
        System.out.println(hs1);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(200));
       
        System.out.println(ts.ceiling(50));//agar collection me 50 maujud h tb 50 hi output dega na ki near by
        System.out.println(ts.floor(49));//yahi diffrence hai higher and ceiling me
    }
}
