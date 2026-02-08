package Practice.CollectionPractice;

import java.util.*;

public class MapImplementation<K, V> implements CustomMap<K,V> {

    //    private Set< K> key;
    private List<K> key;

    private List<V> value;

    MapImplementation() {
//        this.key =new HashSet<>();
        this.key = new ArrayList<>();
        this.value = new ArrayList<>();
    }

    public void putValue(K k, V val) {

        if (key.contains(k)) {

            throw new RuntimeException("Key already Exist");

        } else {

            this.key.add(k);
            this.value.add(val);

        }

    }

    @Override
    public List<K> getKeys() {
        return this.key;
    }

    @Override
    public List<V> getValues() {
        return this.value;
    }

    @Override
    public V getValue(K k) {

        if (key.contains(k))
            return this.value.get(this.key.indexOf(k));

        else{

            throw new RuntimeException("Key doesn't exist");

        }
    }


    @Override
    public String toString() {
        StringBuilder mapstr = new StringBuilder("{");

        mapstr.append("\n");

        for (int i = 0; i < key.size(); i++) {
            mapstr.append(key.get(i) + " : " + value.get(i) + "\n");
        }

        mapstr.append("}");
        return mapstr.toString();
    }

    public static void main(String[] args) {

        MapImplementation<String, Integer> mapI = new MapImplementation<>();
//        System.out.println(mapI.key);
        mapI.putValue("A", 10);
        mapI.putValue("B", 20);
        System.out.println(mapI.getValue("B"));

        System.out.println(mapI);


    }
}
