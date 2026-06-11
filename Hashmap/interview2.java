import java.util.*;
public class interview2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();

        HashMap<Character,Integer>map=new HashMap<>();

        //Construction of a hastable
        //key- unique characters in the string
        //value- frequency of each character in the string

        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }

        //Scan the entire hashtable and get the index of the non reapting character
        int result =-1;
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("The first non reapting character index is:"+i);
                result=1;
                break;
            }
        }
        if(result==-1){
            System.out.println("No non-reapting charcter present in the string");
        }
    }
    
}
