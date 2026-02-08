package Practice;

/*

Package java.nio
Defines buffers, which are containers for data, and provides an overview of the other NIO packages.


Handles buffers, data types, and charsets
Buffer (abstract)
 ├── ByteBuffer
 │    ├── HeapByteBuffer
 │    └── DirectByteBuffer
 ├── CharBuffer
 ├── ShortBuffer
 ├── IntBuffer
 ├── LongBuffer
 ├── FloatBuffer
 └── DoubleBuffer
Buffer → position, limit, capacity
ByteBuffer is the most important (used by channels)
Heap vs Direct memory

java.nio.channels
Channel (interface)
 ├── ReadableByteChannel
 ├── WritableByteChannel
 └── ByteChannel
      ├── ScatteringByteChannel
      └── GatheringByteChannel
Channels replace InputStream / OutputStream
Can be blocking or non-blocking
Work with ByteBuffer

java.nio.channels.spi (Service Provider Interface)
AbstractSelectableChannel
 ├── SocketChannel
 ├── ServerSocketChannel
 └── DatagramChannel
 Used internally for selector implementations.

java.nio.channels.Selector (Multiplexing)
Selector
 ├── SelectionKey

Selector
   ↓
Channel (Socket/File)
   ↓
ByteBuffer
   ↓
Application

java.nio.file (NIO.2 – Java 7+)
Path (interface)
 └── Paths (utility class)

Files (utility class)
FileSystem
FileSystems

WatchService

 */

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample  {

    public static void main(String[] args) throws IOException {

        RandomAccessFile file = new RandomAccessFile("Practice/filesample.txt", "r");
        FileChannel channel = file.getChannel(); // channed get

        ByteBuffer buffer =  ByteBuffer.allocate(1024);

        // read data into buffer
        channel.read(buffer);
        // switch write to read mode
        buffer.flip();

        // Itrate over content
        while (buffer.hasRemaining()){
            System.out.println((char) buffer.get());
        }

        // Closing Resources
        channel.close();
        file.close();

    }

}
