package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {
       Set<String> fruit=new HashSet<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("kiwi");
        fruit.add("orange");
        System.out.println(fruit.contains("apple"));
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());

        Set<String> vegetables=new HashSet<>();
        vegetables.add("potato");
        vegetables.add("onion");
        vegetables.addAll(fruit);

        System.out.println(vegetables.size());

        for (String owoc : fruit){
            System.out.println(owoc);
        }
    }
}
