package Practice.CollectionPractice;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFast {

    public static void main(String[] args) {

//        List<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30));
//
//        Iterator<Integer> it = arr.listIterator();
//
//        for (Integer i : arr) {
//
//            arr.add(10);
//
//        }

        CopyOnWriteArrayList<Integer> c1 = new CopyOnWriteArrayList<>(Arrays.asList(10, 20, 33, 21));

        System.out.println(c1);

        for (int i : c1) {
            System.out.print(i + " ");
            c1.remove(Integer.valueOf(i));
        }

        System.out.println(c1);

    }
}
