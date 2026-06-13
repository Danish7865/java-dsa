//PriorityQueue
//PriorityQueue implement krti h que interface ko and enternally follow krta h min heap data structure ko data store krne ke liye
//
import java.util.PriorityQueue;

public class Demo2 
{
    public static void main(String[] args) 
    {
        PriorityQueue pq=new PriorityQueue();
        pq.add(600);
        pq.add(200);
        pq.add(500);
        pq.add(250);
        pq.add(100);
        pq.add(200);//Dublicate value allow h
        //pq.add("pw"); string and null value not allow
        System.out.println(pq);
         PriorityQueue pq1=new PriorityQueue();
        pq1.add("dp");
        pq1.add("pw");
        pq1.add("jk");
        pq1.add("kopa");
        System.out.println(pq1);
    }
}
