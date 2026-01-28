package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize {

    public static void main(String[] args) {

        try(FileInputStream fin = new FileInputStream("user.ser"); ObjectInputStream ois = new ObjectInputStream(fin))
        {
            User user = (User) ois.readObject();
            System.out.println(user.name);
            System.out.println(user.age);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
