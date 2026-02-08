package Practice.CollectionPractice;

import java.util.List;

public interface CustomMap<K,V> {

    public List<K> getKeys();
    public List<V> getValues();
    public V getValue(K k);

}

