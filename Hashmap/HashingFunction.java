import java.util.*;
import java.io.*;

class HashingFunction {
    public static void main(String[] args) {
        HashMap<Integer,String>hashmap=new HashMap<>();
        //functionality of the put function 
        hashmap.put(1, "priya");
        hashmap.put(2, "Danish");
        hashmap.put(5, "Faiz");
        hashmap.put(8, "Komal");

        System.out.println("HashMap of the given Data is:"+hashmap);

        //functionality of the get function
        String result= hashmap.get(8);
        System.out.println("Value of the given key is: " +result);

        //functionality of the containskey
        System.out.println(hashmap.containsKey(2));

        //functionality of the remove functio
        hashmap.remove(1);
        System.out.println("Updated hashmap" + hashmap);

        //iterating using the for loop
        for(Map.Entry<Integer,String>e:hashmap.entrySet()){
            System.out.println("Hasmap is: ");
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }
}