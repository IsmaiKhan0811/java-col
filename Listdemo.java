
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Listdemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
        Iterator itr = al.iterator();
        while(itr.hasNext()){ // Start from beginning check if next present
            System.out.print(itr.next()+" ");// Next present print it
        }
        ListIterator litr = al.listIterator(al.size());//Start from last of the index
        while(litr.hasPrevious()){// check if previous is present or not 
            System.out.print(litr.previous()+ " ");// pring previous
        }
        
    }}
    

