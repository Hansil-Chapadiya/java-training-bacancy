package Practice;

import java.io.Serializable;

public class User implements Serializable {

    String name;
    int age;

    User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

}
