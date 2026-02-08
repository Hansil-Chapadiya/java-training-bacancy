package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOExample2 {

    public static void main(String[] args) throws IOException {

        Path p = Path.of("Practice/filesample.txt");


        Files.writeString(p, "Hello there king here", StandardOpenOption.APPEND);

        String content = Files.readString(p);
        System.out.println(content);


    }

}
