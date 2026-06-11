class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Child thread Executing");
        try
        {
            Thread.sleep(3000);

        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        System.out.println("Child class task complete");
    }
}
public class Demo6
{
    public static void main(String[] args) 
    {
        System.out.println("Main thread");
        Demo d=new Demo();

        Thread t1=new Thread(d);
        t1.start();
    }
}