import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Demo5
{
    public static void main(String[] args) 
    {
        List<Integer> list=Arrays.asList(9,3,4,5,6,8,2);//collection pe perform krne ke liye strem ka use kiya jata h
        System.out.println(list);

        Stream<Integer>streamData=list.stream();

        // long count=streamData.count();
        // System.out.println(count);
        Stream<Integer>finStream=streamData.filter(n->n%2==0).sorted().map(n->n*2);//method chaining all method are include in one method

        // Stream<Integer>sortedStream=filData.sorted();

        // Stream<Integer>mapStream=sortedStream.map(n->n*2);

        finStream .forEach(n->System.out.println(n));
        //streamData.forEach(n->System.out.println(n));

        

    }
}
