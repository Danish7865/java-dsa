package Stack;
import java.util.*;

public class stackfunction {
    public static void main(String[] args) {
        Stack<Integer>stack1=new Stack<>();

        //Push the elements inside the stck
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);

        //print the top most element in the stack
        System.out.println("The top most elements in the stack before deletion is:"+stack1.peek());
        
        //Delete the top element from the stack
        stack1.pop();

        //Print the most element in the stack
        System.out.println("The top most elements in the stack after deletion is:"+stack1.peek());
        
        //Search an element in the stack
        //Search function returns -1 when the element is not present in the stack
        System.out.println("Elements 2 present in the position is:"+stack1.search(2));
        
        //Check whether the stack is empty or not 
        //Empty function returns the boolean value 
        System.out.println("Is stack empty or not:  "+stack1.empty());
    }
    
}
