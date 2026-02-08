package Practice.CollectionPractice;

import java.util.Scanner;

public class CalculatorDemo {

    public CalculatorDemo() {
    }

    double add(double num1 , double num2)
    {
        return  num1 + num2;
    }

    double mul(double num1, double num2)
    {
        return  num1 * num2;
    }

    double div(double num1, double num2){

        if (num2 == 0) throw new ArithmeticException();
        else return  num1 / num2;
    }

    double mod(double num1, double num2){

        return num1 % num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        Integer num1 =Integer.parseInt( sc.nextLine());

        System.out.println("Enter Number 2: ");
        Integer num2 =Integer.parseInt( sc.nextLine());



    }
}
