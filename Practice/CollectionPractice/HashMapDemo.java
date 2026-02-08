package Practice.CollectionPractice;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<HashMapPractice, String> map = new HashMap<>();

        HashMapPractice h1 = new HashMapPractice(1, "Hansil");
        HashMapPractice h2 = new HashMapPractice(2, "Eve");
        HashMapPractice h3 = new HashMapPractice(2, "Alice");


//        System.out.println(h1.hashCode());
//        System.out.println(h2.hashCode());
//        System.out.println(h3.hashCode());

        map.put(h1, "Hansil");
        map.put(h2, "Eve");
        map.put(h3, "Alice");

        System.out.println(map);
    }

}
