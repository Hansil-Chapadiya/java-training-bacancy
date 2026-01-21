package Practice;

import java.io.IOException;

public class ExceptionHandling {

    public int i = 10;

    public void method() {
        // try {

        // System.out.println("From try");
        // return i;

        // } catch (Exception e) {

        // return 0;
        // } finally {
        // System.out.println("From finally");
        // i =90;
        // return i;
        // }
        try {
            throw new IOException();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");

    }

    public static void main(String[] args) {

        ExceptionHandling e1 = new ExceptionHandling();
        try {

            // e1.method();
            int n = 10 / 0;
        } finally {
            System.out.println("Hello");    
        }

        System.out.print("end");
    }

}
