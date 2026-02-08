
/*


The java.lang package is a core, built-in package in the Java programming language that contains classes fundamental to the design and operation of Java programs. It is automatically imported into every Java program, meaning you do not need an explicit import java.lang.* statement to use its classes.
Key Features and Purpose
The java.lang package provides essential functionalities used by virtually all Java applications:

Foundation of the Class Hierarchy: It includes the Object class, which is the root of all other classes in Java.

String Manipulation: It provides classes for working with character strings, such as String, StringBuffer, and StringBuilder.

Wrapper Classes: It offers classes that wrap Java's primitive data types into objects (e.g., Integer for int, Boolean for boolean, Double for double), which is necessary for use with collections and generics.

System and Runtime Operations: Classes like System and Runtime offer methods to interact with the host environment, manage the Java Virtual Machine (JVM), and handle input/output (e.g., System.out.println()).

Mathematical Operations: The Math and StrictMath classes provide standard mathematical functions (e.g., sqrt(), log(), sin()).

Exception and Error Handling: It includes the base class Throwable, from which all exceptions and errors in Java are derived, such as Exception and Error.

Multithreading Support: Classes like Thread and ThreadGroup are provided for implementing concurrent programming and managing threads of execution.

Important Classes in java.lang
Some of the most frequently used classes in the java.lang package include:

Object: The ultimate superclass of all Java classes.

String: Represents immutable character strings.

System: Contains useful class fields and methods for system operations (e.g., System.in, System.out).

Math: Contains methods for performing numeric operations.

Thread: Used to create and control threads.
Throwable: The superclass for all exceptions and errors.

Wrapper Classes:
Boolean
Byte
Character
Double
Float
Integer
Long
Short

 */

package Practice.CollectionPractice;
import java.util.*;

public class BriefIntro {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        Random rnd = new Random();

        for(int i = 0; i < 5; i++){
//            l.add((int) (Math.random() * 10));
            l.add(rnd.nextInt(10));
        }

        System.out.println(l);

        Collections.sort(l);

        Iterator<Integer> i = l.iterator();

        while (i.hasNext())
        {
            int num = i.next();
            System.out.println(num);
        }
    }
}



/*


The java.util package in Java is a standard, built-in library that provides a comprehensive collection of utility classes and interfaces for common programming tasks. It is one of the most widely used packages, essential for handling data structures, date and time, user input, and more.

Key functionalities and components of the java.util package include:

Collections Framework: This is a major part of the package, offering interfaces and classes for working with groups of data.
Interfaces: List (e.g., ArrayList, LinkedList), Set (e.g., HashSet, TreeSet), and Map (e.g., HashMap, TreeMap).

Utility Classes: Collections and Arrays provide static methods for sorting, searching, and manipulating elements in collections and arrays.

Iterators: Iterator and ListIterator are used to traverse elements within a collection.

Date and Time: Classes for managing dates, times, time zones, and calendars.
Date, Calendar, GregorianCalendar, and TimeZone are commonly used.

Input and Output: The Scanner class is widely used for parsing primitive types and strings from various input sources, such as the keyboard or files.

Random Number Generation: The Random class generates streams of pseudorandom numbers.

Configuration Management: Classes like Properties manage application configuration settings.

Legacy Classes: The package also contains older classes for backward compatibility, such as Vector, Hashtable, and StringTokenizer.


Yes, by definition, a utility class contains only static methods


| Interface | Hash Table | Resizable Array | Balanced Tree | Linked List | Hash Table + Linked List |
| --------- | ---------- | --------------- | ------------- | ----------- | ------------------------ |
| Set       | HashSet    | —               | TreeSet       | —           | LinkedHashSet            |
| List      | —          | ArrayList       | —             | LinkedList  | —                        |
| Deque     | —          | ArrayDeque      | —             | LinkedList  | —                        |
| Map       | HashMap    | —               | TreeMap       | —           | LinkedHashMap            |

Iterable
  └── Collection
       └── AbstractCollection
            ├── List → AbstractList → ArrayList, LinkedList
            ├── Set → AbstractSet → HashSet, LinkedHashSet, TreeSet
            ├── Queue → AbstractQueue → PriorityQueue, LinkedList
            └── Deque → ArrayDeque, LinkedList

Map (separate)
  └── AbstractMap → HashMap, LinkedHashMap, TreeMap


// Stack is  legacy Class , that's why not in Collection
// Modern time Stack replaced by Deque in java

// Why?
Why ArrayDeque > Stack:

Faster (no synchronization overhead)

Cleaner design

Recommended by Oracle itself

Iterable
  └── Collection
       └── List
            └── Vector
                 └── Stack


// Collections is utility class
Collections provides static utility methods that operate on collections:

sort(List)

reverse(List)

shuffle(List)

binarySearch(List, key)

synchronizedList(List)

unmodifiableList(List)

java.lang.Object
   └── java.util.Collections



 */

