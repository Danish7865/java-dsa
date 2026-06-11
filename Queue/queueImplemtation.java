package Queue;
import java.util.*;

public class queueImplemtation {
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
        //to add data insise the queue
        for(int i=0; i<10; i++){
            q.add(i);
        }
        System.out.println("Queue data looks like"+q);

        // to remove the element from the queue dequeue
        System.out.println("The top element in the queue befor delection is"+q.peek());

        //to remove the elemente from the queue -dequeue
        q.remove();

        //to display the top element present in the queqe
        System.out.println("The top element in the quque after delection is "+q.peek());

        //to check the size of the queue
        System.out.println("The current size of the queue is"+q.size());
    }
}
