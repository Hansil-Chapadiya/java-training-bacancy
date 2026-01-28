/*

File does NOT represent file data, it represents a path + metadata

*/

/*

Why we require marker interface:

Marker interface = a TAG for the JVM / framework

Because Java wanted:

Compile-time safety

Class-level capability

Zero runtime overhead

No accidental misuse


JVM internally checks:
if (!(obj instanceof Serializable)) {
    throw new NotSerializableException();
}



We need to Serialize it into Byte because computer understands only bytes

Without serialization:

Object dies when program ends

With serialization:

Convert object → bytes

Store on disk

Restore later

Java Serializable is considered a mistake because it relies on implicit behavior, introduces serious security risks, tightly couples data to class structure, and makes versioning fragile. Modern systems prefer explicit and controlled serialization formats.
Serializable failed because it did too much without asking permission.

Modern systems avoid Java Serializable and instead use explicit formats like JSON or Protobuf. These formats are converted into bytes for storage or transport, but give better security, versioning, and cross-language compatibility.

 */

package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOPractice {


    public static void main(String[] args) {

        File f1 = new File("Practice/file1.txt");

        if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (
                FileInputStream fopen = new FileInputStream(f1); FileOutputStream fwrite = new FileOutputStream(f1, true)) {
            fwrite.write("1".getBytes());
            fwrite.flush();
            System.out.println(f1.getName());

            byte[] arr = fopen.readAllBytes();

            for(byte b: arr){
                System.out.print((char)(b));
            }

        } catch (
                Exception e) {
            System.out.println(e.getMessage());

        }

    }
}


/*


Object
 └── InputStream          (abstract)
      └── FileInputStream (reads bytes from file)

Object
 └── OutputStream          (abstract)
      └── FileOutputStream (writes bytes to file)


Object
 └── Reader              (abstract)
      └── FileReader     (reads characters)

Object
 └── Writer              (abstract)
      └── FileWriter     (writes characters)

1) InputStream → Reading → FileInputStream
✅ Correct

2) OutputStream → Writing → FileOutputStream
✅ Correct

3) FileReader → Character Stream
✅ Correct

4) FileWriter → Character Writer Stream
✅ Correct

5) File → metadata
✅ Correct

 */


/*

Java IO provides simple blocking stream-based file and network operations, while NIO was introduced to support non-blocking, scalable IO using buffers and channels for high-performance applications.

| IO                  | NIO                    |
| ------------------- | ---------------------- |
| Blocking            | Non-blocking           |
| Stream-based        | Buffer-based           |
| One thread per task | One thread, many tasks |
| Slow at scale       | Fast at scale          |

---------------------------

Java IO (classic IO)
How it really works

Each stream = one connection

Each stream is handled by one thread

If data is not ready → thread blocks

int n = inputStream.read(); // thread stops here

Result:

1 client = 1 thread

1000 clients = 1000 threads 😵

Threads waste time waiting

----------------------------------------------
Java NIO
How it works

Many channels (files, sockets)

One or few threads

Threads do NOT wait

They ask:

“Who is ready right now?”

selector.select(); // wakes only when something is ready

Result:


1000 connections

1–4 threads

CPU works only when needed 🔥

“NIO multiplexes many channels over fewer threads using readiness-based scheduling.”

 */