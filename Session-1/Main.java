public class Main {

    public static void main(String args[]) {
        // System.out.println("Hello World!");

        String s1 = "Hansil";
        // String s2 = "Hansil";
        String s2 = new String("Hansil").intern(); // forcefullly put into SCP

        if (s1 == s2) {
            System.out.println("True");
        }
    }

}