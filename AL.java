import java.util.ArrayList;

public class AL {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        
        System.out.println(al);
        System.out.println(al.contains(400));
        // 2. Allows Duplicate
        al.add(100);
        System.out.println("After adding duplicate: " + al);
         // 4. Index-based Access
        System.out.println("Element at index 1: " + al.get(1));
        // 6. Update element using set()
        al.set(1, 999);
        System.out.println("After update: " + al);
        System.out.println("****************************");
        ArrayList al2 = new ArrayList(); // Add Hetrogenous data members
        al2.add('e');
        al2.add(100);
        al2.add("PW Skills");
        al2.add(10.8);
        System.out.println(al2);
        System.out.println("*******************************");


    }
    
}
