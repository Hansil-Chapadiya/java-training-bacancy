package Practice.CollectionPractice;

import java.util.*;

public class SortingExample {

    public static void main(String[] args) {

        ArrayList<Integer> arr =  new ArrayList<>();

        arr.add(10);
        arr.add(30);
        arr.add(2);
        arr.add(4);

        arr.sort((a, b) -> b - a);

        System.out.println(arr);
    }
}
