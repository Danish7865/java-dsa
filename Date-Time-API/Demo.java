//import java.util.Date;
//import java.util.AbstractList;


public class Demo
{
    public static void main(String[] args) 
    {
        java.util.Date dt=new java.util.Date();// hame aaise bhi import kar skte h
        System.out.println(dt);//ye java util package ke under h jo ki date time day sb kuchh deta h

        long timeInMs=dt.getTime();
        java.sql.Date dt1=new java.sql.Date(timeInMs);// ye sql package ke under h jo only date hi deta h aur constuctor bhi pass krna prta h
        System.out.println(dt1);// ye sb java 1.8 ke pahle tha java 1.8 se joda.api se ham import krte h

        java.util.ArrayList al=new java.util.ArrayList<>();
    }
}