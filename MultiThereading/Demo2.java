import java.util.Scanner;

class Calc extends Thread
{
    public void run() // jo bhi task h vo hame run method ke under hi likhna prega
    {
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("**************************************");
    }
}
class Message extends Thread
{
    public void run()
    {
        System.out.println("Displaying important message task");
        try
        {
            for(int i=0; i<3; i++)
        {
            System.out.println("Focus is important to master skills");// tread secuduler decide krega kon excute hoga ham nhi 
            Thread.sleep(3000); //exception handle
        }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");

        }
        
        System.out.println("Displaying import message task ended");
    }
}





public class Demo2 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started");
        Calc t1=new Calc();
        Message t2=new Message();
        // agar hamlog run method ko call karenge to single multithreding kam krega not wrok threading
        t1.start();// run method ko call nhi karenge ham strat method ko call krenge yani ham thread method ko all program handover kar rhe h
        t2.start();// thred method cpu ka time west nhi hone dega agar t1 me dealy hogi to t2 ko excuted kr dega
    }
}
