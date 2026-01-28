package Practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {

        User user = new User("Hansil", 21);

        try (FileOutputStream fos = new FileOutputStream("user.ser"); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(user);
            System.out.println("Object Serialized");
        } catch (RuntimeException | FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
