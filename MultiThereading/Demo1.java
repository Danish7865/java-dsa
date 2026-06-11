class MyThread extends Thread// jaise hi ham extends krte h thread class ko all property recieved in myThread class 
{
    public void run()
    {
        System.out.println("Child Thread");
    }

}



public class Demo1 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");

        MyThread t=new MyThread();
        t.start();
    }
}
