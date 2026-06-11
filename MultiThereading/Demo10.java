import java.util.*;
class Car implements Runnable
{
    public void run()// yaha synchronized key word hata kar ham ek block bna kr vaha de diye
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+" Has entered the parking lot");
            Thread.sleep(3000);
            synchronized(this)// yaha ham bna denge kuki parking slot me to ham tino bando ko ek sath bhej skte h
            {
            System.out.println(Thread.currentThread().getName()+" Got into Car to drive");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" Started to drive the car");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+"Came back and parked the car");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }
}

// not possible one car drive at a time three person, it is big problem in multithreading. this is race problem
//is problem ko solve krne ke liye ham Synchronized ka used krte h
// Synchronized ka used tab ham krte h jab hamare pass ek hi resource ho aur multiple thread usko excute krna chahte ho



public class Demo10
{
    public static void main(String[] args) 
    {
        Car c=new Car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
