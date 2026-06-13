enum Week  
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
    //agar koi bhi chiz constant h to java me use capital latter me likhte h 
    //ye java ka syntax ka convention h ise ham on data type kahte h
}
public class Demo6 
{
    enum Result 
    {
        PASS,FAIL,NR;// enum ko class ke under aur bahar use kr skte h
    }
    public static void main(String[] args) 
    {
        Week w=Week.MON;// enum ka ham object nhi bna skte
        System.out.println(w);

        int index=Week.MON.ordinal();// index value fetch
        System.out.println(index);

        Week [] wr=Week.values();// array of week
        for(Week w1:wr)
        {
            System.out.println(w1+":"+w1.ordinal());
        }
    }
}
