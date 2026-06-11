//map

import java.util.*;

public class Demo6 
{
    public static void main(String[] args) 
    {
        HashMap hm1=new HashMap();
        hm1.put(null, null);//null value is allow
        hm1.put(01,"Danish");
        hm1.put(02, "faiz");
        hm1.put(03, "shahid");
        hm1.put(04, "Aajad");
        hm1.put(05, "Danish");//Dublicate values are allow but key not allow
        System.out.println(hm1);

        HashMap hm2=new HashMap();
        hm2.put("rohit", "radha");//key string bhi ho skta but unique hona chahiye
        hm2.put("Danish", "faiz");
        hm2.put("adil", "shan");// jis order me data de rhe h agar usi order me data ptint krna chahte h to linkedhashmap ki class ko
        System.out.println(hm2);

        LinkedHashMap lhm3=new LinkedHashMap();
        lhm3.put("rohit", "radha");
        lhm3.put("Danish", "faiz");
        lhm3.put("adil", "shan");
        System.out.println(lhm3);


    }
}
