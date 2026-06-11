import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Demo3 
{
    public static void main(String[] args) 
    {
        List<Integer> list=Arrays.asList(2,3,4,5,6,8,9);
        Stream<Integer>streamData=list.stream();//jab ham stream bna lete h tab ham data ko ek bar hi use karenge
        streamData.forEach(n->System.out.println(n));
        //streamData.forEach(n->System.out.println(n));// second time not use

        System.out.println(list);

    }
}
