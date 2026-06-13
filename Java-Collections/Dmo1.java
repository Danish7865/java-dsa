//ArrayDeque
//ArrayDeque implement directly krta h Deque interface ko jo extend kr rha tha que interface ko
//intarnally follow krta h double ended que ko jise apko ye ifficient ho jayega jab bhi apko insearchan opration perform 
//krna h at the rareend and as well as the foranted aur ye bhut hi light weight hota h aur ye nature me Dynamic hota h
import java.util.*;
public class Dmo1 
{
    public static void main(String[] args) 
    {
        ArrayDeque ad1=new ArrayDeque();// ArrayDeque me ham ham index data ko change nhi kr skte and bich me data nhi de skte
        ad1.add(100);
        ad1.add(200);
        ad1.add(200);//ArrayDeque me dublicate allow h
        System.out.println(ad1);
        //ArrayDeque Double ended program ko follow krta h matlab aap start and end se data de skte ho
        ad1.addFirst(50);
        ad1.addLast(60);
        System.out.println(ad1);

        ad1.add("pw");
        System.out.println(ad1);//hemogeneous and heterogeneous data are allow

        ad1.offer(500);//offer and add dono ka work same h yani data ko add krna
        ad1.offerLast(10);//jaruri nhi h ki data add hi hoga kai bar reject bhi ho jata h
        ad1.offerFirst(1);//offer ka use ham tab karenge jb data add ho tabhi thik h nhi ho tabhi thik h
        System.out.println(ad1);

    }
}
