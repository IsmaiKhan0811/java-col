import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println(al);
        // for(int i=0;i<al.size();i++){
        //     System.out.println(al.get(i));
        //     al.add(100); // Stuck in infinite loop if we do any modifictaiom while using for loop
        // }
        //Fail Fast
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            //al.add(100);// Stop execution and compiler gives error
        }
        //Fail Safe
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();// execution will not stop 
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        System.out.println(al1);
        Iterator itr1 = al1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            al1.add(100); // if we do this operation while iterating execution will not stop 
        }

    }}
    

