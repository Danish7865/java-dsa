import java.util.*;
class MyThread1 extends Thread// multithreading using simple run method
{
    public void run()
    {
        String tName=Thread.currentThread().getName();
        if(tName.equals("CALC"))
        {
            Calc();
        }
        else
        {
            importMesg();
        }
    }
    public void Calc()
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
    public void importMesg()
    {
        System.out.println("Displaying important message task");
        try
        {
            for(int i=0; i<3; i++)
        {
            System.out.println("Focus is important to master skills");
            Thread.sleep(3000);
        }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");

        }
        
        System.out.println("Displaying import message task ended");

    }
}
public class Demo5
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started");

        MyThread1 thread1=new MyThread1();
        MyThread1 thread2=new MyThread1();

        thread1.setName("CALC");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();
    }
}
