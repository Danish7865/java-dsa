//Iterator and list iterator

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo5 
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(400);
        al.add(600);
        al.add(300);
        al.add(900);
        System.out.println(al);
    System.out.println("***************************************");
        //for loop
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    System.out.println("***************************************");
        //for each
        for(Object o:al)
        {
            System.out.println(o);
        }
    System.out.println("***************************************");    
// not best apporoch for fetching tha data
//best apporoch is cursor apporoch jise ham iterator bhi khte h
Iterator itr=al.iterator();
while (itr.hasNext())
{
    //Integer i=(Integer)itr.next();
    System.out.println(itr.next());
}
System.out.println("***************************************");
ListIterator litr=al.listIterator(al.size());
while (litr.hasPrevious()) 
{
    System.out.println(litr.previous());
}
// Listitretor kewal list class me hi use kr skte h linked and array list me baki kisi me ise use nhi kr skte 

    }
}
