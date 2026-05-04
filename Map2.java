import java.util.*;

public class Map2 {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();// order of insertion not maintail
        ht.put(1,"Rohan");
        ht.put(2,"Aryan");
        ht.put(3,"Nikhil");
        ht.putIfAbsent(3,"Nikhil");
        System.out.println(ht);

        System.out.println("*****************************");
        TreeMap tm = new TreeMap();
        
        tm.put(1,"Athrav");
        tm.put(2,"Rahul");
        // Integer i = new Integer(5); we can build hetrogenous keys in our program
        // tm.put(i,"Bittu");
        System.out.println(tm);
    


    }
    
}
