import java.util.LinkedList;

public class LinkedListDemo{ // Linked List
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(300);
        System.out.println(ll);
        System.out.println(ll.get(1));

        System.out.println(ll.indexOf(300));
        System.out.println(ll.lastIndexOf(300));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.push(10);// push 10 at beginnig
        System.out.println(ll);
        System.out.println(ll.pop()); // PoP the rectently push element which is 10 
    }
    
}
