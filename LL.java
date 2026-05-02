import java.util.LinkedList;

public class LL {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(200);
        ll.add(300);
        System.out.println(ll);
        System.out.println("************");
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add("PW");
        ll1.add('f');
        ll1.add(3.2);
        System.out.println(ll1); // Can store Hetrogenous type of data
        System.out.println("************");
        LinkedList ll2 = new LinkedList();
        ll2.add(10);
        ll2.add(20);
        ll2.add(30);
        ll2.addFirst(0);
        ll2.addLast(40);
        System.out.println(ll2);

        System.out.println(ll2.peek());// Gives first element
        System.out.println(ll2); // Gives whole list as they originally are
        System.out.println(ll2.poll()); // Gives last element
        System.out.println(ll2);// After poll() Original list will delete First element
        

    }
    
}
