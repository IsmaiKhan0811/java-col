import java.util.*;
 class Student{
    private String name;
    private int id;
    
}
 class Employe{
    private String name;
    private int id;
}
public class demo{
    public static void main(String[] args){
        Student st = new Student();
        Student st2 = new Student();
        Employe em = new Employe();
        Employe em2 = new Employe();
        ArrayList<Student> al = new ArrayList<Student>();// Only Store object of Student type
        System.out.println(al.add(st));//We dont have to do typecasting/downcasting explicitly
        System.out.println(al.add(st2));
        // al.add(em); Gives the error at complile time so we can deduct error earlier at compile time
        
    }
}