public class DataTypes {

    public void primitiveDataType() {

        System.out.println("Numeric Data Types\n");

        System.out.println("Byte");
        Byte b = 127;
        System.out.println("Byte B = " + b + "\n");

        System.out.println("Short");
        Short s = 32767;
        System.out.println("Short S = " + s + "\n");

        System.out.println("Integer");
        int n = 10;
        System.out.println("Intger n = " + n + "\n");

        System.out.println("Long");
        long l = 10l;
        System.out.println("Long l =  " + l  + "\n");

        System.out.println("Float");
        float f = 3.14f;
        System.out.println("Float f = " + f + "\n");

        System.out.println("Double");
        double d = 3.134;
        System.out.println("Double d = " + d + "\n");

        System.out.println("Non-numeric data types\n");

        System.out.println("Character");
        char c = 67;
        System.out.println("Char c = " + c + "\n");

        System.out.println("Boolean");
        boolean bool = false;
        System.out.println("Boolean b  = " + bool + "\n");

    }

    public void nonPrimitiveDataTypes()
    {
        System.out.println("Non-primitive Data types\n");

        System.out.println("String");

        String str1 = "I am the Great";
        String str2 = new String("Hansil the Great");

        System.out.println("String - 1 " + str1 + "\n");
        System.out.println("String - 2 " + str2 + "\n");

        System.out.println("Array");

        char[] charArray = new char[10];

        for (int i = 0; i < 10; i ++)
        {
            charArray[i] = (char) (65 + i);
        }

        System.out.println(charArray);
    }

    public static void main(String[] args) {

        DataTypes d = new DataTypes();
        d.primitiveDataType();

        System.out.println("======================================");

        d.nonPrimitiveDataTypes();

    }

}