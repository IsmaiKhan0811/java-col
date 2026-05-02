import java.util.ArrayDeque;

public class AD { // Array Deque
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        System.out.println(ad);
        ad.addFirst(10);
        ad.addLast(20);
        System.out.println(ad);
        ad.add("PW");
        System.out.println(ad);
        ad.offer(500);
        ad.offerLast(10);
        ad.offerFirst(1);
        System.out.println(ad);

    }
    
}
