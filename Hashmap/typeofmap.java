import java.util.*;
public class typeofmap {
    public static void main(String[] args) {
        //unorder return type
        HashMap<Integer,String>map=new HashMap<>();
        map.put(3,"priya");
        map.put(1,"ajay");
        map.put(7,"piyush");
        map.put(5,"jeet");

        System.out.println("Hashmap map looks like"+map);
        //order of insertion retained in LinkedHashMap
        LinkedHashMap<Integer,String>map1=new LinkedHashMap<>();
        map1.put(3,"priya");
        map1.put(1,"ajay");
        map1.put(7,"piyush");
        map1.put(5,"jeet");

        System.out.println("LinkedHashmap map looks like"+map1);

        //sorted output on the basis of keys
        TreeMap<Integer,String>map2=new TreeMap<>();
        map2.put(3,"priya");
        map2.put(1,"ajay");
        map2.put(7,"piyush");
        map2.put(5,"jeet");
        map2.put(6,"prynka");

        System.out.println("Treemap map looks like"+map2);
    }
}
    
    

