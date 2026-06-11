 public class Demo
 {
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");// by default creat thread
        System.out.println("Before Changing");
        String name =Thread.currentThread().getName();
        System.out.println("The name of main thred is  "+name);
        System.out.println("The priorty of main thread is "+Thread.currentThread().getPriority());

        System.out.println("After changing");
        Thread t=Thread.currentThread();//creat thread by me
        t.setName("PW");
        t.setPriority(1); //priority set

        String name1=Thread.currentThread().getName();
        System.out.println("The name of main thread is  "+name1);
        System.out.println("The priority of main thread is "+ Thread.currentThread().getPriority());

    }
 }