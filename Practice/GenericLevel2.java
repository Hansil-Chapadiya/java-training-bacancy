package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericLevel2<T> {

    ArrayList<T> arr;

    ArrayList<T> get() {
        return this.arr;
    }

    void set(ArrayList<T> arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (T i : this.arr) {
            sb.append(i + ", ");
        }

        sb.append("]");

        return sb.toString();
    }

    public static void main(String[] args) {

        GenericLevel2<String> strarray = new GenericLevel2<>();
        strarray.set(new ArrayList<>(Arrays.asList("Hello", "New", "World")));
        System.out.println(strarray);

        GenericLevel2<Integer> intarray = new GenericLevel2<>();
        intarray.set(new ArrayList<>(Arrays.asList(10,203,30)));
        System.out.println(intarray);

        GenericLevel2<Double> doubleArray = new GenericLevel2<>();
        doubleArray.set(new ArrayList<>(Arrays.asList(12.0, 13.9, 12.0)));
        System.out.println(doubleArray);

    }
}
