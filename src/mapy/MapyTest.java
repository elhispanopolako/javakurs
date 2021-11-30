package mapy;

import java.util.HashMap;
import java.util.Map;
public class MapyTest {
    public static void main(String[] args) {
        Map<Integer,String> students=new HashMap<>();

        students.put(1,"Basia");
        students.put(2,"Tadek");
        students.put(3,"Andrzej");

        System.out.println(students.get(2));

        Map<Integer,String> otherStudenets=new HashMap<>();
        otherStudenets.putAll(students);

        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Andrzej"));
        System.out.println(students.size());
        System.out.println(students.isEmpty());
        for (Integer key: students.keySet()){
            System.out.println(key);
            System.out.println(students.get(key));
        }

        for(String student: students.values()){
            System.out.println(student);
        }
    }

}
