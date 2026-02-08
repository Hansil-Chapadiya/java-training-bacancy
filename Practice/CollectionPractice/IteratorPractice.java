package Practice.CollectionPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        System.out.println("Initial List: " + list);

        ListIterator<String> it = list.listIterator();

        // 1️ Forward traversal + index info
        System.out.println("\nForward Traversal:");
        while (it.hasNext()) {
            int index = it.nextIndex();   // index info
            String value = it.next();     // move forward
            System.out.println("Index: " + index + ", Value: " + value);

            // 2️ Replace element
            if (value.equals("B")) {
                it.set("B-modified");
            }

            // 3️ Add element
            if (value.equals("A")) {
                it.add("A-added");
            }
        }

        System.out.println("\nAfter forward ops: " + list);

        // 4️ Backward traversal
        System.out.println("\nBackward Traversal:");
        while (it.hasPrevious()) {
            int index = it.previousIndex(); // index info
            String value = it.previous();   // move backward
            System.out.println("Index: " + index + ", Value: " + value);

            // 5️ Remove element
            if (value.equals("C")) {
                it.remove();
            }
        }
        System.out.println("\nFinal List: " + list);

    }
}
