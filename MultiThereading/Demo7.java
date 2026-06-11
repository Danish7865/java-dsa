class Printing implements Runnable
{
    public void run()
    {
        try
    {
        for(int i=0; i<2;i++)
        {
            System.out.println("Focus is important");
            Thread.sleep(3000);

        }
    }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }
}
public class Demo7 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Main method strted");

        Printing p=new Printing();

        Thread t1=new Thread(p);// thread ka obj bnanane se usko life nhi milti jab ham start krte h tab usko life milti h
        System.out.println(t1.isAlive());// false show hoga kyuki t1 ko life nhi mili h
        t1.start();
        System.out.println(t1.isAlive());// true
        t1.join();//t1 jab tak aapna kam krke jion na krle tab tak wait krega uske bad hi main thread finished hoga

        System.out.println("Main thread finished");
    }
}
