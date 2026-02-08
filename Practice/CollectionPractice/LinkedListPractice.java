package Practice.CollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {



    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(10);
        ar.add(24);

        LinkedList<Integer> ll = new LinkedList<>(ar);

        System.out.println(ll);
//        for (int i : ll){
//            System.out.println(i);
//        }
    }
}
