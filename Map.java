import java.util.*;
public class Map {
    public static void main(String[] args){
        HashMap hm = new HashMap();// oreder of insertion can be different
        hm.put(1,"Virat ");
        hm.put(2,"Rohit");
        hm.put(3,"Dhoni");
        hm.put(4,"Dhawan");
        hm.put(5,"Dhawan");// Value can be duplicate
         // hm.put(5,"Jadega"); key will not be same for two entries
        System.out.println(hm);
        LinkedHashMap lhm = new LinkedHashMap(); // Assure the order of insertion
        lhm.put(1,"Salman");
        lhm.put(2, "Sharukh");
        lhm.put(3,"Aamir ");
        lhm.put(4,"Akshay");
        // lhm.put(4,"salman"); only one value is saved in key no 4
        System.out.println(lhm);

    }
    
}
