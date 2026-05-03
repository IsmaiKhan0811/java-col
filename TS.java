
import java.util.TreeSet;

public class TS {
    public static void main(String[] args){
        TreeSet ts = new TreeSet();// TreeSet implements set interface
        ts.add(10);
        ts.add(57);
        ts.add(6);
        ts.add(77);
        ts.add(56);
        ts.add(2);
        ts.add(88);
        ts.add(6);// duplicate not allow
        System.out.println(ts);// Store in Asscending order
        TreeSet ts1 = new TreeSet();
       System.out.println(ts.contains(6));
       System.out.println(ts.getFirst());
       System.out.println(ts.pollFirst()); // Remove first element which is 2
       System.out.println(ts);// New otput will not contain 2

    }
    
}
