import java.util.*;
import java.util.Map.*;
public class Map1{
    private String name;
    private int age;
    private String city;
    public Map1(String name, int age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
        public String getname(){
            return name;

        }
        public int getage(){
            return age;
        }
        public String getcity(){
            return city;
        }


    }

public class Student {
    public static void main(String[] args){
        Student st1 = new Student("Rohan",19,"Mumbai");
        Student st2 = new Student("Abhi",18,"Delhi");
        Student st3 = new Student("aman", 20, "Kolkata");
        HashMap map = new HashMap();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);    
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry data = (Entry)itr.next();
            System.out.println(data.getkey()+ " "+ data.getValue());
        }

       
    }
    
}
