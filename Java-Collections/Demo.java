//Arraylist
import java.util.*;
public class Demo 
{

    public static void main(String[] args) 
    {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        System.out.println("***************************************");

        ArrayList al2=new ArrayList();
        al2.add("pw skill");
        al2.add(1);
        al2.add("j");
        al2.add(100);
        System.out.println(al2);
        al2.add("Danish");//homo
        System.out.println(al2);//jaise array me size fixed hota h vaisa yaha nhi h ye dynamic h
        System.out.println("***************************************");

        ArrayList al3=new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        al3.add(4);
        System.out.println(al3);
        System.out.println("After adding collection");

        al3.addAll(al2);// ek collection dusre collection me add ho skti h
        System.out.println(al3);

        al3.add(2,"pw");
        System.out.println(al3);//yaha data replace nhi ho rhi h balki add ho rhi h index 2 pe pw add ho jayegi and index 2 ke data age shift ho jayegi 
       // jis order me ham data denge usi order me hame data receive hoga yaha dublicate valu allow h
    }
}