import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Demo4
{
    public static void main(String[] args) 
    {
        List<Integer> list=Arrays.asList(9,3,4,5,6,8,2);
        System.out.println(list);

        Stream<Integer>streamData=list.stream();

        // long count=streamData.count();//if stream ko ek bar use kar liye to dubara another bhi operation nhi kr skte h
        // System.out.println(count);
        Stream<Integer>filData=streamData.filter(n->n%2==0);//filter ke throw data fetch

        Stream<Integer>sortedStream=filData.sorted();

        Stream<Integer>mapStream=sortedStream.map(n->n*2);//map laga kr koi bhi operation kar skte h

        mapStream.forEach(n->System.out.println(n));
        //streamData.forEach(n->System.out.println(n));

        

    }
}
