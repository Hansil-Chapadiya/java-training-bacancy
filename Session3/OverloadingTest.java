package Session3;

public class OverloadingTest {

    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public double getSum(double num1, double num2) {
        return num1 + num2;
    }

    public float getSum(float num1, float num2) {
        return num1 + num2;
    }

    public static void main(String[] args){

        OverloadingTest o1 = new OverloadingTest();
        System.out.println(o1.getSum(12.25, 25.65));
        System.out.println(o1.getSum(12.25f, 25.65f));
        System.out.println(o1.getSum(12, 25));

    }
}
