package Practice.CollectionPractice;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapPractice  {

    public  int id;
    String name;

    HashMapPractice(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return  true;
        if (o == null || o.getClass() != this.getClass()) return  false;

        HashMapPractice newObj = (HashMapPractice) o;
        return  this.id == newObj.id;
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }
}
