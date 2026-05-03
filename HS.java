
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HS {
    public static void main(String[] args) {// HashSet implements HashSet 
        HashSet hs = new HashSet();// Uses HashTable internally
        hs.add(9);
        hs.add(45);
        hs.add(5);
        hs.add(88);
        hs.add(1);
        hs.add(70);
        hs.add(1);// No Duplicate allow
        System.out.println(hs);// No insertion order
        LinkedHashSet lhs = new LinkedHashSet();// extends HashList
        lhs.add(6);// Use hash table and Linkedlist
        lhs.add(88);
        lhs.add(4);
        lhs.add(67);
        lhs.add(1);
        lhs.add(9);
        lhs.add(1);// No duplicate allow
        System.out.println(lhs);// Maintains Insertion order



        
    }}
    

